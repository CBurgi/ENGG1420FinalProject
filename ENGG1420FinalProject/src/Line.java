/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The class for lines
 * @see Shape.java
 * 
 * @author Cole Burgi
 */
public class Line extends Shape{
    private int endX, endY;
    
    @Override
    public void setR(int r){
    //This method is not needed for this shape  
    }
    
    @Override
    public  void setLength(int l){
    //This method is not needed for this shape  
    }
    @Override
    public  void setWidth(int w){
    //This method is not needed for this shape    
    }
    @Override
    public  void setEndX(int x){
        this.endX = Math.abs(x);
    }
    public  void setEndY(int y){
        this.endY = Math.abs(y);  
    }
}
