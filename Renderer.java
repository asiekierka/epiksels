import java.util.ArrayList;
import java.util.List;

public abstract class Renderer {
	protected int w;
	protected int h;
	protected ArrayList<GFXObject> gfxList;

	protected Renderer(int width, int height) {
		this.w = width; this.h = height;
		this.gfxList = new ArrayList<GFXObject>();
	}

	/**
	 * Gets the surface width, in pixels.
	 *
	 * @return	Width
	 */
	public int getWidth() {
		return w;
	}
	/**
	 * Gets the surface height, in pixels.
	 *
	 * @return	Height
	 */
	public int getHeight() {
		return h;
	}

	/**
	 * Renders the surface, basing on the GFX list.
	 */
	public abstract void render();

	public void stop() {
	}

	//public abstract boolean registerHandler(RendererHandler handler);
	// TODO

	/**
	 * Gets the List object containing the GFXes being rendered.
	 */
	public List getGFXList() {
		return (List)gfxList;
	}

	/**
	 * Adds a new GFX object.
	 *
	 * @param	gfx	New GFX object to add.
	 */
	public void addGFX(GFXObject gfx) {
		gfxList.add(gfx);
	}
	/**
	 * Removes a GFX object.
	 *
	 * @param	gfx	GFX object to remove.
	 */
	public void removeGFX(GFXObject gfx) {
		gfxList.remove(gfx);
	}
	/**
	 * Clears the GFX list.
	 */
	public void clearGFX() {
		gfxList.clear();
	}

	public abstract void loadCharset(Charset charset);
	public abstract void loadPalette(Palette palette);
}
