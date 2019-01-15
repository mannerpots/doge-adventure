import greenfoot.*;

/**
 * Write a description of class GrassLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestLevel extends Level
{

    /**
     * Constructor for objects of class GrassLevel.
     * 
     */
    public ForestLevel()
    {
        setBackground("forestbackground.jpg");
    }
    public void populate()
    {
        String[] map = new String[] {"123                                   ",
                                     "                                      ",
                                     "                                      ",
                                     "                                      ",
                                     "                                      ",
                                     "                                      ",
                                     "        a              w              ",
                                     "                                      ",
                                     "                 a                    ",
                                     "           w                          ",
                                     "                                      ",
                                     "        a                   w         ",
                                     "                 c         bb         ",
                                     "                                      ",
                                     "      a                   w      bbb  ",
                                     "                                      ",
                                     "         w              bbb           ",
                                     "               bbb                    ",
                                     "            w                         ",
                                     "          bbb                         ",
                                     "                                      ",
                                     "bbbbbbbbb                             "};
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbwamdksf123".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new MainChar();
                if (kind == 1) actor = new ForestPlatform();
                if (kind == 2) actor = new IceWorm();
                if (kind == 3) actor = new MovingForestPlatform();
//                 if (kind == 4) actor = new Brick();
//                 if (kind == 5) actor = new Brick();
//                 if (kind == 7) actor = new Brick();
//                 if (kind == 8) actor = new Brick();
                if (actor == null)actor = new IceWorm();
                if (kind == 9) actor = new Hundreds();
                if (kind == 10) actor = new Tens();
                if (kind == 11) actor = new Ones();
                addObject(actor, 16+j*32, 16+i*32);
        }
    }
    public void nextLevel()
    {
        //Greenfoot.setWorld();
    }
}