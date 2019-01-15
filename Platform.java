import greenfoot.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    private int x;
    private int y;
    private int WIDTH;
    private int HEIGHT;


    /**
     * Constructor for objects of class Platform
     */
 public void Platform(int a, int b, int w, int h)
 {
     x = a;
     y = b;
     WIDTH = w;
     HEIGHT = h;
 }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
 public void paintRect(Graphics2D g) {
  g.fillRect(x, y, WIDTH, HEIGHT);
 }
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
