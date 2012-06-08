public class DummyMap extends Map {

	public Block getBlock(int x, int y)
	{
		return Block.createBlock();
	}

	public void setBlock(int x, int y, Block block)
	{
	}
}
