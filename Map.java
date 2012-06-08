// This class is a map abstraction.

public abstract class Map {

	public abstract Block getBlock(int x, int y);
	public abstract void setBlock(int x, int y, Block block);

	public Block[] getRenderingWindow(Player player, int w, int h)
	{
		assert(w>0);
		assert(h>0);
		Block[] blocks = new Block[w*h];
		int sx = player.getX()-(w/2);
		int sy = player.getY()-(h/2);
		for(int iy=0;iy<h;iy++)
			for(int ix=0;ix<w;ix++)
				blocks[iy*w+ix]=this.getBlock(sx+ix,sy+iy);
		return blocks;
	}
}
