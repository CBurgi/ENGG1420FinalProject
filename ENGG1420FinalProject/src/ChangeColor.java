/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The effect that changes the color of the shape
 * @see Effect.java
 * 
 * @author Cole Burgi
 */
public class ChangeColor extends Effect{
    private String[] color = {"0","0","0"};
    
     public ChangeColor(Shape n, int f, String[] c){
         setShape(n);
         setStartFrame(f);
         
         color = c;
     }
     
     @Override
     public void run(){
         n.setColor(color);
     }
}
