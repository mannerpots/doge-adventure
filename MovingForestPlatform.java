import greenfoot.*;

/**
 * Write a description of class MovingForestPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingForestPlatform extends ForestPlatform
{
    private int spriteHeight = getImage().getHeight();
        private int spriteWidth = getImage().getWidth();
        private int direction = 1;
        private int speed = 1;
    /**
     * Act - do whatever the MovingForestPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    

        //tryToHoldPlayer();
        checkEdge();
        checkWall();
        move();
    }    
    public void checkEdge(){
        if(getX()-spriteWidth/2<=0){
            direction=1;
        }
        if(getX()+spriteWidth/2>=getWorld().getWidth()){
            direction=-1;
        }           
    }
    public void checkWall(){
        Actor leftWall = getOneObjectAtOffset(spriteWidth/-2,0,Platform.class);
            if(!(leftWall == null)){
                direction = 1;
            }
        
        Actor rightWall = getOneObjectAtOffset(spriteWidth/2,0,Platform.class);
            if(!(rightWall == null)){
                direction = -1;
            }
        }
    public void move(){
        move(speed*direction);
    }
    
}
