public abstract class Renderer {
	protected int w;
	protected int h;

	public Renderer(int width, int height) {
		this.w = width; this.h = height;
	}

	public int getWidth() {
		return w;
	}
	public int getHeight() {
		return h;
	}

	public abstract void startPaint();
	public abstract void finishPaint();

	public void stop() {
	}

	public abstract void drawRectangle(int x, int y, int width, int height, Color color);
	public abstract void drawCircle(int x, int y, int radius, Color color);
	public abstract void drawText(int x, int y, String text, Color color);
	public abstract void drawText(int x, int y, String text, Color color, int zoom);
	public abstract void drawChar(int x, int y, int chr, Color color);
	public abstract void drawChar(int x, int y, int chr, Color color, int zoom);

	public abstract void loadCharset(Charset charset);
	public abstract void loadPalette(Palette palette);
}
