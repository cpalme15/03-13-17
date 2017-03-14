package drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.image.*;
public class Panel extends JPanel implements MouseListener,MouseMotionListener{
	private Color c=null;
	Random r=new Random();
	private int x=50,y=100;
	private int x1,y1,x2,y2;
	private int[] xPoints={100,250,400,50,400};
	private int[] yPoints={370,150,370,200,200};
	public Panel()
	{
		super();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setBackground(Color.LIGHT_GRAY);;
	}
	public void paintComponent(Graphics gr)
	{
		c= new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
		super.paintComponent(gr);//calls this everytime mess with panel
		Graphics2D g2d=(Graphics2D) gr;
		BufferedImage img= new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		Graphics2D gg=img.createGraphics();
		gg.setColor(Color.YELLOW);
		gg.fillRect(0, 0, 10, 10);
		gg.setColor(Color.BLACK);
		gg.drawRect(1, 1, 6, 6);
		gg.setColor(Color.blue);
		gg.fillRect(1, 1, 3, 3);
		gg.setColor(Color.red);
		gg.fillRect(4, 4, 3, 3);
		g2d.setPaint(new TexturePaint(img,new Rectangle(10,10)));
		g2d.fill(new RoundRectangle2D.Double(355,30,75,100,50,50));
		gr.setColor(c);
		gr.drawOval(x, y, 200,100);
		g2d.setPaint(new GradientPaint(0,70,new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)),
				45,100,new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256))));
		g2d.fill3DRect(x+200, y+200, 200, 100, true);
		g2d.setStroke(new BasicStroke(6.0f));
		g2d.fill(new Ellipse2D.Double(5,30,65,100));
		g2d.draw(new Arc2D.Double(240,30,75,100,0,270,Arc2D.PIE));
		gr.drawLine(x1, y1, x2, y2);
		gr.fillPolygon(xPoints, yPoints, yPoints.length);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
	x2=e.getX();
	y2=e.getY();
	repaint();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
	
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();
		y=e.getY();

		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x1=e.getX();
		y1=e.getY();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
