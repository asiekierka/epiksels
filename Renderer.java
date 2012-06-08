import java.util.ArrayList;
import java.util.List;

public abstract class Renderer {
	protected int w;
	protected int h;
	protected ArrayList<GFXObject> gfxList;

	public Renderer(int width, int height) {
		this.w = width; this.h = height;
		this.gfxList = new ArrayList<GFXObject>();
	}

	public int getWidth() {
		return w;
	}
	public int getHeight() {
		return h;
	}

	public void render() {

	}

	public void stop() {
	}

	//public abstract boolean registerHandler(RendererHandler handler);
	// TODO

	public List getGFXList() {
		return (List)gfxList;
	}

	public void addGFX(GFXObject gfx) {
		gfxList.add(gfx);
	}
	public void removeGFX(GFXObject gfx) {
		gfxList.remove(gfx);
	}
	public void clearGFX() {
		gfxList.clear();
	}

	public abstract void loadCharset(Charset charset);
	public abstract void loadPalette(Palette palette);
}
