
import java.io.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The animation player
 * 
 * @author Cole Burgi
 */
public class AnimationPlayer {
    
    String[] shapeTypes = {"Circle", "Rect", "Line"};
    String[] effectTypes = {"Hide", "Show", "Jump", "ChangeColor"};
    private int frames = 0;
    private int fps = 0;
    private int elements = 0;
    
    ArrayList<Shape> shapesList = new ArrayList<Shape>();
    Shape[] shapes = null;
    
    ArrayList<Effect> effectsList = new ArrayList<Effect>();
    Effect[] effects = null;
    
    /**
     * Loads the file and makes Shape objects based on the file, as well
     * as Effect objects that are attached to a specific shape.
     * @see 'shapes' and 'effects' array
     * 
     * @see Shape.java
     * @see Effect.java
     * 
     * @param fileName 
     * @author Cole Burgi
     */
    public void loadAnimationFromFile(String fileName){
        
        //the "test\\" part is just there because I am putting test file in the test directory -Cole
        File file = new File("test\\" + fileName);
        
        //makes sure the file exists -Cole
        if (!file.exists()) {
            System.out.println("There is no file here!");
            return;
        }
        
        //makes a buffered reader to read each line in the file -Cole
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(file)); 
            
            //Reads the first 3 lines to set # of frames, fps, and # of elements -Cole
            try{
                frames = Integer.parseInt(input.readLine().strip().replaceAll("[^0-9]", ""));
                fps = Integer.parseInt(input.readLine().strip().replaceAll("[^0-9]", ""));
                elements = Integer.parseInt(input.readLine().strip());
            }catch(NumberFormatException ex){
                ex.printStackTrace();
            }
            System.out.println(frames);
            System.out.println(fps);
            System.out.println(elements);
            
            shapes = new Shape[elements];
            //reads blank line -Cole
            input.readLine();
            
             //runs through all the shapes -Cole
            for(Shape n: shapes){
                //Sets the type of shape -Cole
                String shapeType = input.readLine().strip();
                if(shapeType.contains(shapeTypes[0]/*Which is Circle*/)){
                    n = new Circle();
                    
                    System.out.println("c");
                    
                }
                else if(shapeType.contains(shapeTypes[1]/*Which is Rect*/)){
                    n = new Rect();
                    System.out.println("r");
                    
                }
                else if(shapeType.contains(shapeTypes[2]/*Which is Line*/)){
                    n = new Line();
                    System.out.println("l");
                    
                }else{
                    
                    //if the shape isn't an accepted shape, we will skip to the next shape -Cole
                    n = new Null();
                    System.out.println("x");
                    while(true){
                        String s = input.readLine();
                        if(s == null || s.isBlank())break;
                    }
                    continue;
                }
                
                while(true){
                        String s = input.readLine();
                        //stops making the shape at the blank line -Cole
                        if(s == null || s.isBlank())break;
                        
                        if(s.contains("effect")){
                            String eType = input.readLine();
                            if(eType.contains(effectTypes[0]/*Which is Hide*/)){
                                int startFrame = Integer.parseInt(input.readLine().strip().replaceAll("[^0-9]", ""));
                                
                                //adds a Hide effect of Shape n and start startFrame -Cole
                                effectsList.add(new Hide(n, startFrame));
                            }
                            if(eType.contains(effectTypes[1]/*Which is Show*/)){
                                int startFrame = Integer.parseInt(input.readLine().strip().replaceAll("[^0-9]", ""));
                                
                                //adds a Show effect of Shape n and start startFrame -Cole
                                effectsList.add(new Show(n, startFrame));
                            }
                            if(eType.contains(effectTypes[2]/*Which is Jump*/)){
                                int startFrame = 0;
                                int jumpX = 0;
                                int jumpY = 0;
                                for(int i=0; i<3; i++){
                                    String eS = input.readLine();
                                    if(eS.contains("start")) startFrame = Integer.parseInt(eS.strip().replaceAll("[^0-9]", ""));
                                    else if(eS.contains("x:"))jumpX = Integer.parseInt(eS.strip().replaceAll("[^0-9]", ""));
                                    else if(eS.contains("y:"))jumpY = Integer.parseInt(eS.strip().replaceAll("[^0-9]", ""));
                                }
                                
                                //adds a Jump effect of Shape n, start startFrame, x jumpX, and y jumpY -Cole
                                effectsList.add(new Jump(n, startFrame, jumpX, jumpY));
                                
                            }
                            if(eType.contains(effectTypes[3]/*Which is ChangeColor*/)){
                                int startFrame = 0;
                                String[] color = {"0","0","0"};
                                for(int i=0; i<3; i++){
                                    String eS = input.readLine();
                                    if(eS.contains("start")) startFrame = Integer.parseInt(eS.strip().replaceAll("[^0-9]", ""));
                                    else if(eS.contains("color:"))color = s.strip().replaceAll("[^0-9,]", "").split(",");
                                }
                                
                                //adds a Jump effect of Shape n, start startFrame, and the three (r, g, b) values -Cole
                                effectsList.add(new ChangeColor(n, startFrame, color));
                            }
                            
                        }
                        
                        //sets x, or startX for Line -Cole
                        else if(s.contains("x:") || s.contains("startX:"))n.setX(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        //sets y, or startY for Line -Cole
                        else if(s.contains("y:") || s.contains("startY:"))n.setY(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        //sets colour in (r,g,b) values, or border colour for line? -Cole
                        else if(s.contains("color:")){
                            //splits the line ex:"color: 255, 0, 0" into {"255", "0", "0"} to use in setColor -Cole
                            String[] c = s.strip().replaceAll("[^0-9,]", "").split(",");
                            n.setColor(c);
                        }
                        //sets border colour in (r,g,b) values for circle or rect -Cole
                        else if(s.contains("borderColor:")){
                            //splits the line ex:"borderColor: 255, 0, 0" into {"255", "0", "0"} to use in setColor -Cole
                            String[] c = s.strip().replaceAll("[^0-9,]", "").split(",");
                            n.setBorderColor(c);
                        }
                        //sets border thickness -Cole
                        else if(s.contains("border:"))n.setBorder(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        //sets length and width for rect -Cole
                        else if(s.contains("length:"))n.setLength(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        else if(s.contains("width:"))n.setWidth(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        //sets endX and enY for line -Cole
                        else if(s.contains("endX:"))n.setEndX(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        else if(s.contains("endY:"))n.setEndY(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                        //sets r for circle -Cole
                        else if(s.contains("r:"))n.setR(Integer.parseInt(s.strip().replaceAll("[^0-9]", "")));
                                
                        
                    }
                shapesList.add(n);    
                
                
            }  
            //sets the completed ArrayLists of effects and shapes to arrays to be properly uses -Cole
            effects = effectsList.toArray(new Effect[0]);
            shapes = shapesList.toArray(new Shape[0]);
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                input.close();
            }catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
    
    /**
     * Creates a frame, that Arron Chin wrote
     * @see MyFrame
     * 
     * @author Cole Burgi
     */
    public void run(){
        
        MyFrame myFrame = new MyFrame(); 
        
        //Just tester for the shapes and effects
        for(Shape n: shapes){
            System.out.println(n.getClass());
        }
        for(Effect n: effects){
            System.out.println(n.n.getX());
        }
    }
}
