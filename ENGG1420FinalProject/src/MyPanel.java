import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creating MyPanel class
public class MyPanel extends JPanel implements ActionListener{

	final int PANEL_WIDTH = 500; //setting the panel width to 500
	final int PANEL_HEIGHT = 500; //setting the panel height to 500
	Image object; //naming an image object
	//Image backgroundImage;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT)); //creating the panel size to 
		this.setBackground(Color.black); //set the backround colour to black
		object = new ImageIcon("object.png").getImage();// creating image from image icon	
		//backgroundImage = new ImageIcon("space.png").getImage();
		timer = new Timer(10, this); //preform action every 10 miliseconds
		timer.start();
  
	}
   

        @Override
	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		
		Graphics2D g2D = (Graphics2D) g;
		
		//g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(object, x, y, null); // draws the image
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>=PANEL_WIDTH-object.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y>=PANEL_HEIGHT-object.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint();
	}
}