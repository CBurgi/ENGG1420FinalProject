/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The abstract class that is the superclass for all shapes
 * @see Circle.java
 * @see Rect.java
 * @see Line.java
 * @see Null.java
 * 
 * @author Cole Burgi
 */
public abstract class Shape {
    
    //variables that all shapes will have
    private boolean visible = false;
    private int x, y, border;
    private int[] color = {0, 0, 0};
    private int[] borderColor = {0, 0, 0};
    
    public void setVisible(boolean v){
        this.visible = v;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setBorder(int b){
        this.border = b;
    }
    public void setColor(String[] c){
        this.color[0] = Integer.parseInt(c[0]);
        this.color[1] = Integer.parseInt(c[1]);
        this.color[2] = Integer.parseInt(c[2]);
    }
    public void setBorderColor(String[] c){
        this.borderColor[0] = Integer.parseInt(c[0]);
        this.borderColor[1] = Integer.parseInt(c[1]);
        this.borderColor[2] = Integer.parseInt(c[2]);
    }
    
    //variables that only one/some shapes will have
    public abstract void setR(int r);
    public abstract void setLength(int l);
    public abstract void setWidth(int w);
    public abstract void setEndX(int x);
    public abstract void setEndY(int y);
}
