public class Player {
	private int x;
	private int y;
	private int id;

	// Initializers
	public Player(int x, int y, int id)
	{
		this.x=x; this.y=y; this.id=id;
	}

	public Player(int x, int y)
	{
		this(x,y,0);
	}

	public Player(int id)
	{
		this(0,0,id);
	}

	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getId()
	{
		return id;
	}

	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}

	public void moveX(int x)
	{
		this.x += x;
	}
	public void moveY(int y)
	{
		this.y += y;
	}
}
