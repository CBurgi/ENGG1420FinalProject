/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The class for circles
 * @see Shape.java
 * 
 * @author Cole Burgi
 */
public class Circle extends Shape {
    private int r;
    
    
    @Override
    public void setR(int r){
        if(r!=0)this.r = Math.abs(r);
        else this.r = 1;
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
    //This method is not needed for this shape    
    }
    public  void setEndY(int y){
    //This method is not needed for this shape    
    }
        
    
}
