/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The abstract class that is the superclass for all effects
 * @see Hide.java
 * @see Show.java
 * @see Jump.java
 * @see ChangeColor.java
 * 
 * Attached to a specific shape that the effect will affect
 * @see Shape.java
 * 
 * @author Cole Burgi
 */
public abstract class Effect {
    public Shape n;
    private int startFrame;
    
    public void setShape(Shape n){
        this.n = n;
    }
    public void setStartFrame(int f){
        if(f!=0) startFrame = Math.abs(f);
        else startFrame = 1;
    }
    public int getStartFrame(){
        return startFrame;
    }
    
    public abstract void run();
}
