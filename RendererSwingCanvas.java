import java.awt.*;
import java.awt.image.*;
import java.util.List;
import javax.swing.*;

public class RendererSwingCanvas extends JComponent {
	private RendererSwing r;
	private List gfxList;

	public RendererSwingCanvas(RendererSwing r) {
		this.r=r;
		Dimension d = new Dimension(r.getWidth(), r.getHeight());
		setSize(d);
		setPreferredSize(d);
	}

	public void draw(List list) {
		this.gfxList = list;
		repaint();
	}

	protected void paintComponent(Graphics gfx) {
		// TODO
	}
}
