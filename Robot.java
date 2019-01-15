import greenfoot.*;

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends WalkingEnemy
{
    private GreenfootImage r1 = new GreenfootImage("robotenemy1 right.png");
    private GreenfootImage r2 = new GreenfootImage("robotenemy2 right.png");
    private GreenfootImage r3 = new GreenfootImage("robotenemy3 right.png");
    private GreenfootImage l1 = new GreenfootImage("robotenemy1.png");
    private GreenfootImage l2 = new GreenfootImage("robotenemy2.png");
    private GreenfootImage l3 = new GreenfootImage("robotenemy3.png");
    private int frame = 1;
    public void act() 
    {
        super.act();
    } 
    public void animateRight()
    {
        if(frame == 7)
        {
            setImage(r2);
        }
        else if(frame == 14)
        {
            setImage(r3);
        }
        else if(frame == 21)
        {
            setImage(r2);
        }  
        else if(frame == 28)
        {
            setImage(r1);
            frame = 1;
            return;
        }        
        frame ++;
    }
    public void animateLeft()
    {
        if(frame == 7)
        {
            setImage(l2);
        }
        else if(frame == 14)
        {
            setImage(l3);
        }
        else if(frame == 21)
        {
            setImage(l2);
        }  
        else if(frame == 28)
        {
            setImage(l1);
            frame = 1;
            return;
        }        
        frame ++;
    }
}
