// This class is a map abstraction.

public abstract class Map {

	public abstract Block[] getRenderingWindow(Player player, int w, int h);

	public abstract Block getBlock(int x, int y);
	public abstract void setBlock(int x, int y, Block block);

}
