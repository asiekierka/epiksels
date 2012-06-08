import java.lang.reflect.Constructor;

public class Block {
	private int id;
	private static Block[] byId = new Block[256];

	static {
		byId[0] = Block.createBlock();
	}

	protected Block() {
	}

	/**
	 * Creates a dummy block.
	 *
	 * @return	a dummy block (air)
	 */
	public static Block createBlock() {
		Block temp = new Block();
		temp.id=0;
		return temp;
	}

	/**
	 * Creates a block based on Compressed data.
	 *
	 * @param	data	Compressed data of the block.
	 * @return	a block with data based on the Compressed data.
	 */
	public static Block createBlock(byte[] data) {
		int newId = 255&(byte)data[0];
		assert(newId>=0 && newId<256);
		Block temp = null;
		try {
			temp = byId[newId].getClass().newInstance();
		} catch(Exception e) {
			System.out.println("[Block] Couldn't create block of ID " + newId + "! " + e.getMessage());
			e.printStackTrace();
		}
		if(temp!=null) temp.setCompressed(data);
		return temp;
	}

	public int getId() {
		return id;
	}
	public int getParam() {
		return 0;
	}
	public int getColor() {
		return 0;
	}
	public int getChar() {
		return 0;
	}

	public static boolean isSolid() {
		return false;
	}

	public void setId(int id) {
		this.id=id;
	}
	public void setParam(int param) {
	}
	public void setColor(int col) {
	}
	public void setChar(int chr) {
	}

	public byte[] getCompressed() {
		byte[] tmp = new byte[1];
		tmp[0]=(byte)id;
		return tmp;
	}

	public void setCompressed(byte[] data) {
		assert(data.length==1);
		id=255&(byte)data[0];
	}

	public GFXBlock getGFX() {
		return new GFXBlock(this);
	}
}
