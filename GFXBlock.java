public class GFXBlock extends GFXObject {

	protected Block block;
	protected static final int width = 8;
	protected static final int height = 8;
	protected int zoom;

	public GFXBlock(Block block, int zoom) {
		this.block = block;
		this.zoom = zoom;
	}

	public GFXBlock(Block block) {
		this(block,1);
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

	public int getChar() {
		// TODO: Remember to make this an if-block once we add more block types.
		return block.getChar();
	}

	public int getColor() {
		// Same ^
		return block.getColor();
	}
}
