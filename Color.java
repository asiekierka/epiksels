public class Color {
	private int bgColor;
	private int fgColor;
	private int drawingStyle;

	public static final int OUTLINE = 0;
	public static final int FILL = 1;
	public static final int OUTLINE_FILL = 2;

	public Color(int ocolor, int fcolor, int drawstyle) {
		this.bgColor = fcolor;
		this.fgColor = ocolor;
		this.drawingStyle = drawstyle;
	}
	public Color(int ocolor, int fcolor, Palette palette, int drawstyle) {
		this.bgColor = palette.getColor(fcolor);
		this.fgColor = palette.getColor(ocolor);
		this.drawingStyle = drawstyle;
	}
	public Color(int ocolor) {
		this(ocolor,0,Color.OUTLINE);
	}
	public Color(int ocolor, Palette palette)
	{
		this(ocolor,0,palette,Color.OUTLINE);
	}

	public int getBgColor() { return bgColor; }
	public int getFgColor() { return fgColor; }
	public int getStyle() { return drawingStyle; }
}
