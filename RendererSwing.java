import java.awt.*;
import java.awt.image.*;
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

	public void loadPalette(Palette palette) {
		this.palette = palette;
	}
	public void loadCharset(Charset charset) {
		this.charset = charset;
		redrawCharset();
	}

	public void startPaint() {}
	public void finishPaint() {}
	public void drawRectangle(int x, int y, int width, int height, Color color) {}
	public void drawCircle(int x, int y, int radius, Color color) {}
	public void drawText(int x, int y, String text, Color color) {}
	public void drawText(int x, int y, String text, Color color, int zoom) {}
	public void drawChar(int x, int y, int chr, Color color) {}
	public void drawChar(int x, int y, int chr, Color color, int zoom) {}
}
