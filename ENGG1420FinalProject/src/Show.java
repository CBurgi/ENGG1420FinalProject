/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The effect that makes the shape visible
 * @see Effect.java
 * 
 * @author Cole Burgi
 */
public class Show extends Effect{
     public Show(Shape n, int f){
         setShape(n);
         setStartFrame(f);
     }
     
     @Override
     public void run(){
         n.setVisible(true);
     }
}
