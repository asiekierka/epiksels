public class DummyMap extends Map {

	public Block[] getRenderingWindow(Player player, int w, int h)
	{
		assert(w>=0);
		assert(h>=0);
		Block[] blocks = new Block[w*h];
		for(int i=0;i<w*h;i++)
			blocks[i]=new Block(0,0);
		return blocks;
	}

	public Block getBlock(int x, int y)
	{
		return new Block(0,0);
	}

	public void setBlock(int x, int y, Block block)
	{
	}
}
