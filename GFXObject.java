public abstract class GFXObject {
	protected int priority;

	public GFXObject() {
		priority = 1;
	}

	public abstract int getWidth();
	public abstract int getHeight();

	public int getPriority() {
		return priority;
	}
	public void setPriority(int p) {
		this.priority=p;
	}
}
