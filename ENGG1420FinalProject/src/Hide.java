/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cburg
 */
public class Hide extends Effect{
     public Hide(Shape n, int f){
         setShape(n);
         setStartFrame(f);
     }
     
     
     @Override
     public void run(){
         n.setVisable(false);
     }
}