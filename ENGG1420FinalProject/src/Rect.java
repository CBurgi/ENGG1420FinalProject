/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The class for rectangles
 * @see Shape.java
 * 
 * @author Cole Burgi
 */
public class Rect extends Shape {
    private int length, width;
    
    @Override
    public void setR(int r){
    //This method is not needed for this shape  
    }
    
    @Override
    public  void setLength(int l){
        if(l!=0)this.length = Math.abs(l);
        else this.length = 1;
    }
    @Override
    public  void setWidth(int w){
        if(w!=0)this.width = Math.abs(w);
        else this.width = 1;   
    }
    
    @Override
    public  void setEndX(int x){
    //This method is not needed for this shape    
    }
    public  void setEndY(int y){
    //This method is not needed for this shape    
    }
}
