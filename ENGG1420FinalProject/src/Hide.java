/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The effect that makes the shape no longer visible
 * @see Effect.java
 * 
 * @author Cole Burgi
 */
public class Hide extends Effect{
     public Hide(Shape n, int f){
         setShape(n);
         setStartFrame(f);
     }
     
     
     @Override
     public void run(){
         n.setVisible(false);
     }
}
