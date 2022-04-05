/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Loads the animation player and starts the screen.
 * @see AnimationPlayer.java
 * 
 * @author Cole Burgi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnimationPlayer player = new AnimationPlayer();
        player.loadAnimationFromFile("animation1.txt");
        player.run();
    }
    
}
