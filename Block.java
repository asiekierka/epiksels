public class Block {
	private int id;
	private int param;
	private int chr;
	private int col;

	public Block(int id, int param, int chr, int col) {
		this.id=id; this.param=param;
		this.chr=chr; this.col=col;
	}
	public Block(int id, int chr, int col) {
		this(id,0,chr,col);
	}
	public Block(int id, int param) {
		this(id,param,0,0);
	}
	public Block(int id) {
		this(id,0,0,0);
	}

	public int getId() {
		return id;
	}
	public int getParam() {
		return param;
	}
	public int getColor() {
		return col;
	}
	public int getChar() {
		return chr;
	}

	public boolean isSolid() {
		return false;
	}

	public void setId(int id) {
		this.id=id;
	}
	public void setParam(int param) {
		this.param=param;
	}
	public void setColor(int col) {
		this.col=col;
	}
	public void setChar(int chr) {
		this.chr=chr;
	}

	public GFXBlock getRender() {
		return new GFXBlock(this);
	}
}
