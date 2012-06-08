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

	public void stop() {
	}

	//public abstract boolean registerHandler(RendererHandler handler);
	// TODO

	public abstract void loadCharset(Charset charset);
	public abstract void loadPalette(Palette palette);
}
