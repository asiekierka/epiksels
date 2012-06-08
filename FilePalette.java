import java.io.*;

public class FilePalette extends Palette {

	public FilePalette(String name, int size) {
		super(size);
		FileInputStream in = null;
		// Copied directly from 64pixels. :|
		try {
			in = new FileInputStream(name);
			for(int i=0;i<size;i++)
			{
				byte[] dat = new byte[3];
				in.read(dat,0,3);
				this.setColor(i,((255&(byte)dat[0])<<16)|((255&(byte)dat[1])<<8)|(255&(byte)dat[2]));
			}
			in.close();
		}
		catch(Exception e) {
			System.out.println("[FilePalette] Error loading palette! " + e.getMessage());
			e.printStackTrace();
		}
	}
}
