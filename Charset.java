public class Charset {
	protected boolean[][] chars;

	public Charset(int size) {
		chars = new boolean[size][64];
	}

	public int getSize() {
		return chars.length;
	}

	public boolean[] getBlockData(int id)
	{
		if(id>=0 && id<256)
			return chars[id];
		return new boolean[64];
	}
	public void setBlockData(int id, boolean[] data)
	{
		if(id>=0 && id<256 && data.length==64)
			chars[id] = data;
	}

}
