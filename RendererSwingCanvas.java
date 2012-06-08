import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class RendererSwingCanvas extends JComponent {
	private RendererSwing r;

	public RendererSwingCanvas(RendererSwing r) {
		this.r=r;
		Dimension d = new Dimension(r.getWidth(), r.getHeight());
		setSize(d);
		setPreferredSize(d);
	}
}
