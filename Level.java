import greenfoot.*;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        populate();
    }
    public void populate() {
       /* String[] map = new String[]{};
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbpwmdksf".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Player();
                if (kind == 1) actor = new Brick();
                if (kind == 2) actor = new Brick();
                if (kind == 3) actor = new Brick();
                if (kind == 4) actor = new Monster();
                if (kind == 5) actor = new Door();
                if (kind == 7) actor = new Score();
                if (kind == 8) actor = new Floater();
                addObject(actor, 16+j*32, 16+i*32);
        }*/
    }
    public void nextLevel() {}
    
    
}
