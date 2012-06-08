import java.io.*;

public class FileCharset extends Charset {

	public FileCharset(String name, int size) {
		super(size);
		byte[] cga = new byte[2048];
		FileInputStream in = null;
		try {
			in = new FileInputStream(name);
			for(int i=0; i<size; i++)
				in.read(cga,i<<3,8);
			in.close();
		}
		catch(Exception e) {
			System.out.println("[FileCharset] Error loading charset! " + e.getMessage());
			e.printStackTrace();
		}
		for(int id=0;id<size;id++)
		{
			boolean[] tmpchars = new boolean[64];
			for(int yPos=0; yPos<8; yPos++)
			{
				int data = 255&(int)cga[id*8+yPos];
				for(int pixelPos=7;pixelPos>=0;pixelPos--)
				{
					if((data&1)==1)
						tmpchars[yPos*8+pixelPos] = true;
					data >>= 1;
				}
			}
			this.setBlockData(id,tmpchars);
		}
	}
}
