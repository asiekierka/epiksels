public class GFXBlock extends GFXObject {

	private Block block;
	private static final int width = 8;
	private static final int height = 8;

	public GFXBlock(Block block) {
		this.block = block;
	}

	public Block getBlock() {
		return block;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	public void render(int x, int y, Renderer r)
	{
		// TODO
	}
}
