/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The effect that changes the x and y values of the shape moving it
 * @see Effect.java
 * 
 * @author Cole Burgi
 */
public class Jump extends Effect{
    private int jumpX, jumpY;
    
     public Jump(Shape n, int f, int x, int y){
         setShape(n);
         setStartFrame(f);
         
         this.jumpX = x;
         this.jumpY = y;
     }
     
    @Override
     public void run(){
         n.setX(jumpX);
         n.setY(jumpY);
     }
}
