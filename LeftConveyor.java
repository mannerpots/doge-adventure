import greenfoot.*;

/**
 * Write a description of class LeftConveryor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftConveyor extends Platform
{   
    private GreenfootImage r1 = new GreenfootImage("conveyor1.jpg");
    private GreenfootImage r2 = new GreenfootImage("conveyor2.jpg");
    private GreenfootImage r3 = new GreenfootImage("conveyor3.jpg");
    private GreenfootImage r4 = new GreenfootImage("conveyor4.jpg");
    private int frame = 1;
    /**
     * Act - do whatever the LeftConveryor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      animate();  
    } 
    public void animate(){
        if(frame == 1)
        {
            setImage(r1);
        }
        else if(frame == 3)
        {
            setImage(r2);
        }        
        else if(frame == 6)
        {
            setImage(r3);
        }        
        else if(frame == 9)
        {
            setImage(r4);
            frame = 1;
            return;
        }        
        frame ++;
    }
}
