import greenfoot.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score=0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setScore();
        setDigit();
    }
    public void setScore(){
        score = ((MainChar)getWorld().getObjects(MainChar.class).get(0)).getScore();
    }
    public int getScore(){
        return score;
    }
    public void setDigit(){
    }
}
