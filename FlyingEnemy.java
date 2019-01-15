import greenfoot.*;

/**
 * Write a description of class FlyingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyingEnemy extends Enemy
{
    private int spriteHeight = getImage().getHeight();
    private int spriteWidth = getImage().getWidth();
    private int direction = 1;
    private int speed = 2;
    public void act() 
    {
        kill();
        checkEdge();
        checkWall();
        move();
        
    }
    public void kill(){
        
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
        if(direction==1){
            animateRight();
        }
        else{
            animateLeft();
        }
    }
    public void animateRight(){
    }
    public void animateLeft(){
    }
}
