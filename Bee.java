import greenfoot.*;

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends FlyingEnemy
{   
    private GreenfootImage left1 = new GreenfootImage("Fire enemy3 left.png");
    private GreenfootImage left2 = new GreenfootImage("Fire enemy4 left.png");
    private GreenfootImage right1 = new GreenfootImage("Fire enemy3.png");
    private GreenfootImage right2 = new GreenfootImage("Fire enemy4.png");
    private int frame = 1;
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
    }
    public void animateRight(){     
        if(frame<10){
           setImage(right2); 
        }
        else if(frame<20)
        {
            setImage(right1);
        }        
        else if(frame == 20)
        {
            setImage(right2);
            frame = 1;
            return;
        }        
        frame ++;
    }
    public void animateLeft(){  
        if(frame<10){
           setImage(left2); 
        }
        else if(frame<20)
        {
            setImage(left1);
        }        
        else if(frame == 20)
        {
            setImage(left2);
            frame = 1;
            return;
        }        
        frame ++; 
    }
}
