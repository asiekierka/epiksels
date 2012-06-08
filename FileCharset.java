import java.io.*;

public class FileCharset extends Charset {

	public FileCharset(String name, int size, int width, int height) {
		super(size,width,height);
		assert(this.getWidth()<=8); // Assume bytes in file.
		byte[] cga = new byte[size*this.getHeight()];
		FileInputStream in = null;
		try {
			in = new FileInputStream(name);
			for(int i=0; i<size; i++)
				in.read(cga,i*this.getHeight(),this.getHeight());
			in.close();
		}
		catch(Exception e) {
			System.out.println("[FileCharset] Error loading charset! " + e.getMessage());
			e.printStackTrace();
		}
		for(int id=0;id<size;id++)
		{
			boolean[] tmpchars = new boolean[this.getCharSize()];
			for(int yPos=0; yPos<this.getHeight(); yPos++)
			{
				int data = 255&(int)cga[id*this.getHeight()+yPos];
				for(int pixelPos=this.getWidth();pixelPos>=0;pixelPos--)
				{
					if((data&1)==1)
						tmpchars[yPos*this.getWidth()+pixelPos] = true;
					data >>= 1;
				}
			}
			this.setBlockData(id,tmpchars);
		}
	}

	public FileCharset(String name, int size) {
		this(name,size,8,8);
	}
}
