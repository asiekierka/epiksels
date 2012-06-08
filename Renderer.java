public abstract class Renderer {

	public abstract int getWidth();
	public abstract int getHeight();
	public abstract void drawRectangle(int x, int y, int width, int height, int color);
	public abstract void drawFRectangle(int x, int y, int width, int height, int color);
	public abstract void drawFRectangle(int x, int y, int width, int height, int color, int outlineColor);
	public abstract void drawCircle(int x, int y, int radius, int color);
	public abstract void drawFCircle(int x, int y, int radius, int color);
	public abstract void drawFCircle(int x, int y, int radius, int color, int outlineColor);
	public abstract void drawText(int x, int y, String text);
	public abstract void drawText(int x, int y, String text, int zoom);
	public abstract void drawChar(int x, int y, int chr, int color);
	public abstract void drawChar(int x, int y, int chr, int color, int zoom);

	public abstract void loadCharset(Charset charset);
	public abstract void loadCharset(Charset charset, int offset);
	public abstract void loadPalette(Palette palette);
}
