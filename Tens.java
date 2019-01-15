import greenfoot.*;

/**
 * Write a description of class Tens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tens extends Score
{
    private GreenfootImage zero = new GreenfootImage("zero.png");
        private GreenfootImage one = new GreenfootImage("one.png"); 
        private GreenfootImage two = new GreenfootImage("two.png");
        private GreenfootImage three = new GreenfootImage("three.png");
        private GreenfootImage four = new GreenfootImage("four.png");
        private GreenfootImage five = new GreenfootImage("five.png");
        private GreenfootImage six = new GreenfootImage("six.png");
        private GreenfootImage seven = new GreenfootImage("seven.png");
        private GreenfootImage eight = new GreenfootImage("eight.png");
        private GreenfootImage nine = new GreenfootImage("nine.png");
        int frame;
        
    public void act() 
    {
        super.act();// Add your action code here.
    }    
    public void setDigit(){
       frame = (int)(super.getScore()/10)%10;  
       if (frame == 0)
       {
           setImage(zero);
       }
       if (frame == 1)
       {
           setImage(one);
       }
       if (frame == 2)
       {
           setImage(two);
       }
       if (frame == 3)
       {
           setImage(three);
       }
       if (frame == 4)
       {
           setImage(four);
       }
       if (frame == 5)
       {
           setImage(five);
       }
       if (frame == 6)
       {
           setImage(six);
       }
       if (frame == 7)
       {
           setImage(seven);
       }
       if (frame == 8)
       {
           setImage(eight);
       }
       if (frame == 9)
       {
           setImage(nine);
       }
    }
}
