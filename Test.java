package drawing;

import javax.swing.JFrame;

public class Test extends JFrame {
  public Test()
  {
	  super();
	  Panel mp= new Panel();
	  this.getContentPane().add(mp);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setSize(500,500);
	  this.setVisible(true);
  }
	public static void main(String[] args) 
	{
		Test fr=new Test();
	}

}
