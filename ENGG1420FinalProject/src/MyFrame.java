
    /**
     * Creates a frame  and Jframe
     * 
     * 
     * @author Aaron Chin
     */
import javax.swing.*;

//creating MyFrame class
public class MyFrame extends JFrame{
	
	MyPanel panel;
        
        
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel); //adding panel to the frame
		this.pack();
		this.setLocationRelativeTo(null); //sets location of object to the middle of the screen
		this.setVisible(true);
	}  
}