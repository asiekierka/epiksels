import java.awt.*;
import java.awt.image.*;
import java.util.ArrayList;
import javax.swing.*;

public class RendererSwing extends Renderer {
	protected Charset charset;
	protected Palette palette;

	private JFrame window;
	private RendererSwingCanvas canvas;

	public RendererSwing(int width, int height) {
		super(width,height);
		window = new JFrame("epiksels");
		window.add(canvas);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	private void redrawCharset() {
		// TODO
	}

	public void render() {
		canvas.draw();
	}
	public void loadPalette(Palette palette) {
		this.palette = palette;
	}
	public void loadCharset(Charset charset) {
		this.charset = charset;
		redrawCharset();
	}
}
