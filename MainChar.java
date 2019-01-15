    import greenfoot.*;
    import java.awt.Rectangle;
    import java.awt.event.KeyEvent;
    import java.awt.Graphics2D;
    import javax.swing.JFrame;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    /**
     * Write a description of class MainChar here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class MainChar extends Actor
    {
       private int spriteHeight = getImage().getHeight();
       private int spriteWidth = getImage().getWidth();
       private int direction = 1;
       private int speed = 3;
       private int jumpSpeed = 3;
       private int vSpeed = 0;
       private Boolean jumping = false;
       private Boolean attacking = false;
       private int jumpCount = 0;
       private int jumpLimit=50;
       private int score =123;
       //resting pics
        private GreenfootImage rest = new GreenfootImage("Doge Resting.png");
        private GreenfootImage restLeft = new GreenfootImage("Doge Resting left.png");
        //jumping pics
        private GreenfootImage jumpL = new GreenfootImage("Doge Jumping left.png");
        private GreenfootImage jumpR = new GreenfootImage("Doge Jumping.png");
        //attack pics
        private GreenfootImage att1r = new GreenfootImage("Doge Attack 0.png");
        private GreenfootImage att2r = new GreenfootImage("Doge Attack 1.png"); 
        private GreenfootImage att3r = new GreenfootImage("Doge Attack 2.png");
        private GreenfootImage att1Left = new GreenfootImage("Doge Attack 0 left.png");
        private GreenfootImage att2Left = new GreenfootImage("Doge Attack 1 left.png");
        private GreenfootImage att3Left = new GreenfootImage("Doge Attack 2 left.png");
        //running pics
        private GreenfootImage run1r = new GreenfootImage("Doge Running 1.png");
        private GreenfootImage run2r = new GreenfootImage("Doge Running 2.png");
        private GreenfootImage run3r = new GreenfootImage("Doge Running 3.png");
        private GreenfootImage run4r = new GreenfootImage("Doge Running 4.png");
        private GreenfootImage run5r = new GreenfootImage("Doge Running 5.png");
        private GreenfootImage run6r = new GreenfootImage("Doge Running 6.png");
        private GreenfootImage run7r = new GreenfootImage("Doge Running 7.png"); 
        private GreenfootImage run8r = new GreenfootImage("Doge Running 8.png");
        private GreenfootImage run1Left = new GreenfootImage("Doge Running 1 left.png");
        private GreenfootImage run2Left = new GreenfootImage("Doge Running 2 left.png");
        private GreenfootImage run3Left = new GreenfootImage("Doge Running 3 left.png");
        private GreenfootImage run4Left = new GreenfootImage("Doge Running 4 left.png");
        private GreenfootImage run5Left = new GreenfootImage("Doge Running 5 left.png");
        private GreenfootImage run6Left = new GreenfootImage("Doge Running 6 left.png");
        private GreenfootImage run7Left = new GreenfootImage("Doge Running 7 left.png"); 
        private GreenfootImage run8Left = new GreenfootImage("Doge Running 8 left.png");
        private int frame = 1;
        private int attackframe = 1;
    public void act(){
       keyPressed();
       animate();
       jump();
       fall();
       grab();
       special();
       
       
    }
    public void keyPressed() {
         if (Greenfoot.isKeyDown("left")){
       direction = -1;
       move();
         }
      else if (Greenfoot.isKeyDown("right")){
       direction = 1;
       move();
         }
     if(Greenfoot.isKeyDown("up")&&checkBelow()){
            jumping=true;
            jumpCount=0;
            vSpeed=-jumpSpeed;
        }
    }
    public void move(){
        if(direction==1&&!checkRight()){
            move(speed*direction);
        }
        if(direction==-1&&!checkLeft()){
            move(speed*direction);
        }
    }
    public void jump(){
        
        if(jumping){
           jumpCount++;
            if (jumpCount<=jumpLimit)
            {
              setLocation(getX(), getY()+vSpeed);
            }
            if (jumpCount>jumpLimit&&vSpeed<0)
            {
              vSpeed++;
            }
            if(vSpeed>=0){
                jumping=false;
            }
        }
        if(checkAbove()){
            jumping=false;
        }
        
    }
    public void fall(){
        if(!jumping&&!checkBelow()){
           if(vSpeed<jumpSpeed){
               vSpeed++;
            }
           setLocation(getX(), getY()+vSpeed);
        }
        else if(!jumping){
            vSpeed=0;
        }
    }
    public void grab()
    {
        if (hitTest(Doritos.class) )
        {
            kill(Doritos.class);
            score = score + 10;
            //Greenfoot.playSound("keyfound.wav");
        }
    }
    public void special(){
       Actor rConveyor = getOneObjectAtOffset(0,32,RightConveyor.class);
       Actor lConveyor = getOneObjectAtOffset(0,32,LeftConveyor.class);
       Actor portal = getOneObjectAtOffset(0,32,Portal.class);
       if(rConveyor!=null){
           move(1);
       }
       if(lConveyor!=null){
           move (-1);
       }
    }
    public void kill(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    public boolean checkRight(){
       Actor rightWall = getOneObjectAtOffset(spriteWidth/2,0,Platform.class);
       if(!(rightWall == null)){
           rightWall=null;
            return true;
       }
       else if(getX()+spriteWidth/2>=getWorld().getWidth()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkLeft(){
        Actor leftWall = getOneObjectAtOffset(spriteWidth/-2,0,Platform.class);
        if(!(leftWall == null)){
            leftWall=null;
            return true;
        }
        else if(getX()-spriteWidth/2<=0){
            return true;
        }
        else{
            return false;
        }
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
    public boolean checkAbove(){
       Actor roof = getOneObjectAtOffset(0,-32,Platform.class);
       if(!(roof == null)){
           roof=null;
           return true;
       }
       else if(getY()+spriteHeight/-2>=getWorld().getHeight()){
            return true;
       }
       else{
            return false;
       }
    }
    public boolean hitTest(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public  int getScore(){
        return score;
    }
    public void animate(){
        if(attacking){
            animateAttack();
        }
        else if( vSpeed!=0){
            animateJump();
        }
        else if (!(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("right"))){
            animateRest();
        }
        else if (direction==1){
            animateRight();
        }
        else if (direction==-1){
            animateLeft();
        }
    }
    public void animateRight()
    {   if(checkBelow()){
        if(frame == 1)
        {
            setImage(rest);
        }
        else if(frame == 3)
        {
            setImage(run1r);
        }
        else if(frame == 5)
        {
            setImage(run2r);
        }
        else if(frame == 7)
        {
            setImage(run3r);
        }   
        else if(frame == 9)
        {
            setImage(run4r);
        }
        else if(frame == 11)
        {
            setImage(run5r);
        }
        else if(frame == 13)
        {
            setImage(run6r);
        }        
        else if(frame == 15)
        {
            setImage(run7r);
        }        
        else if(frame == 17)
        {
            setImage(run8r);
            frame = 1;
            return;
        }        
        frame ++;
    }
    }
   public void animateLeft()
    { if(checkBelow()){
        if(frame == 1)
        {
            setImage(restLeft);
        }
        else if(frame == 3)
        {
            setImage(run1Left);
        }
        else if(frame == 5)
        {
            setImage(run2Left);
        }
        else if(frame == 7)
        {
            setImage(run3Left);
        }   
        else if(frame == 9)
        {
            setImage(run4Left);
        }
        else if(frame == 11)
        {
            setImage(run5Left);
        }
        else if(frame == 13)
        {
            setImage(run6Left);
        }        
        else if(frame == 15)
        {
            setImage(run7Left);
        }        
        else if(frame == 17)
        {
            setImage(run8Left);
            frame = 1;
            return;
        }        
        frame++;
    }
    }
    public void animateJump()
    {
        if (direction==1){
            setImage(jumpR);
        }
        else{
            setImage(jumpL);
        }
    }
    public void animateRest()
    {
        if(direction==1){
             setImage(rest);
        }
        else{
             setImage(restLeft);
        }
    }
    public void animateAttack()
    {
        if(attackframe == 1)
        {
            setImage(rest);
        }
        else if(attackframe == 4)
        {
            setImage(att1r);
        }
        else if(attackframe == 7)
        {
            setImage(att2r);
        }
        else if(attackframe == 10)
        {
            setImage(att3r);
            frame = 1;
            return;
        }        
        attackframe++;
    }
    
}


