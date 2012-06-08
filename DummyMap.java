public class DummyMap extends Map {

	public Block[] getRenderingWindow(Player player, int w, int h)
	{
		assert(w>=0);
		assert(h>=0);
		Block[] blocks = new Block[w*h];
		for(int i=0;i<w*h;i++)
			blocks[i]=Block.createBlock();
		return blocks;
	}

	public Block getBlock(int x, int y)
	{
		return Block.createBlock();
	}

	public void setBlock(int x, int y, Block block)
	{
	}
}
