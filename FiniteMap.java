public class FiniteMap extends Map {
	private int w;
	private int h;

	private Block[] map;

	public FiniteMap(int xsize, int ysize) {
		this.w=xsize;
		this.h=ysize;
		map = new Block[xsize*ysize];
	}

	public int getPos(int x, int y) {
		return (y*w)+x;
	}

	public Block getBlock(int x, int y) {
		if(x>=0 && x<w && y>=0 && y<h && map[getPos(x,y)]!=null)
			return map[getPos(x,y)];
		else
			return Block.createBlock();
	}

	public void setBlock(int x, int y, Block block) {
		if(x>=0 && x<w && y>=0 && y<h)
			map[getPos(x,y)]=block;
	}

}
