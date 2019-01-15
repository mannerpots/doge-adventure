import greenfoot.*;

/**
 * Write a description of class WalkingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkingEnemy extends Enemy
{
    private int spriteHeight = getImage().getHeight();
    private int spriteWidth = getImage().getWidth();
    private int speed = 2;
    private int vSpeed = 0;
    private int direction = 1;
    public void act() 
    {
        fall();
        checkRight();
        checkLeft();
        move();
        special();
    }
     public void move(){
         if(checkBelow()){
             if(direction==1){
                 animateRight();
                 move(speed*direction);
                }
             if(direction==-1){
                animateLeft();
                move(speed*direction);
             }
         }
    }
     public void fall(){
        if(!checkBelow()){
           if(vSpeed<4){
               vSpeed++;
            }
           setLocation(getX(), getY()+vSpeed);
        }
    }
    public void special(){
       Actor rConveyor = getOneObjectAtOffset(0,32,RightConveyor.class);
       Actor lConveyor = getOneObjectAtOffset(0,32,LeftConveyor.class);
       if(rConveyor!=null){
           move(1);
       }
       if(lConveyor!=null){
           move (-1);
       }
    }   
    public void checkRight(){
       Actor rightWall = getOneObjectAtOffset(spriteWidth/2,0,Platform.class);
       Actor rightFloor = getOneObjectAtOffset(spriteWidth/2,32,Platform.class);
       if(!(rightWall == null)){
           direction=-1;
       }
       else if(rightFloor==null){
           direction=-1;
       }
       else if(getX()+spriteWidth/2>=getWorld().getWidth()){
           direction=-1;
       }
       rightWall=null;
       rightFloor=null;
    }
    public void checkLeft(){
        Actor leftWall = getOneObjectAtOffset(spriteWidth/-2,0,Platform.class);
        Actor leftFloor = getOneObjectAtOffset(spriteWidth/-2,32,Platform.class);
        if(!(leftWall == null)){
            direction=1;
        }
        else if(leftFloor==null){
            direction=1;
        }
        else if(getX()-spriteWidth/2<=0){
            direction=1;
        }
        leftWall=null;
        leftFloor=null;
    }
    public boolean checkBelow(){
        Actor floor = getOneObjectAtOffset(0,32,Platform.class);
        if(!(floor == null)){
            floor=null;
            return true;
        }
       else if(getY()+spriteHeight/2>=getWorld().getHeight()){
            return true;
        }
        else{
            return false;
        }
    }
    public void animateRight()
    {
    }
    public void animateLeft()
    {
    }
}
