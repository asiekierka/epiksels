public class Palette {
	private int[] palette;

	public Palette(int size, int[] data)
	{
		assert(data.length==size);
		this.palette=data;
	}
	public Palette(int size)
	{
		this(size,new int[size]);
	}
	public Palette(int[] data)
	{
		this(data.length,data);
	}

	public int getColor(int id)
	{
		if(id>=0 && id<palette.length)
			return palette[id];
		else
			return palette[0];
	}
	public void setColor(int id, int color)
	{
		if(id>=0 && id<palette.length)
			palette[id] = color;
	}
}
