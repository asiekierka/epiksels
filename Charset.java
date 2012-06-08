public class Charset {
	protected boolean[][] chars;
	protected int width;
	protected int height;

	public Charset(int size, int width, int height) {
		this.chars = new boolean[size][width*height];
		this.width = width; this.height = height;
	}

	public Charset(int size) {
		this(size,8,8); // Assume defaults.
	}

	public int getSize() {
		return chars.length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getCharSize() {
		return this.width*this.height;
	}

	public boolean[] getBlockData(int id)
	{
		if(id>=0 && id<chars.length)
			return chars[id];
		return new boolean[getCharSize()];
	}
	public void setBlockData(int id, boolean[] data)
	{
		if(id>=0 && id<chars.length && data.length==this.getCharSize())
			chars[id] = data;
	}

}
