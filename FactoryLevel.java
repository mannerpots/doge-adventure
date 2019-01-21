import greenfoot.*;

/**
 * Write a description of class FactoryLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactoryLevel extends Level
{

    /**
     * Constructor for objects of class FactoryLevel.
     * 
     */
    public FactoryLevel()
    {
        setBackground("factory3.jpg");
    }
    public void populate()
    {
        String[] map = new String[] {"123                                     ",
                                     "                                        ",
                                     "                                        ",
                                     "                            mm    e     ",
                                     "             l l l        bbbbbbbbb     ",
                                     " mm                  b                  ",
                                     " bb                  b                  ",
                                     "                     b m e e mm     e e ",
                                     "                     bbbbbbbbbbbbmmbbbbb",
                                     "             r r     bbbbbbbbbbbbmmbbbbb",
                                     "                     bbbbbbbbbbbbmmbbbbb",
                                     "  e                  bbbbbbbbbbbbmmbbbbb",
                                     "bbbbbbbb             bbbbbbbbbbbbmmbbbbb",
                                     "                     b                  ",                                 
                                     "                     b                  ",
                                     "            l l l    b    bbbbbbbbbbbbbb",
                                     "                     b                  ",
                                     "                     b                  ",
                                     "          m  e       b                  ",
                                     "       r r r r       b               k  ",
                                     " c          e   mmmmmb       e          ",
                                     "bbbbbbbbbbbbbbbbbbbbbbb    l      r   bb"};
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "cbrlmeksf123".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new MainChar();
                if (kind == 1) actor = new MetalPlatform();
                if (kind == 2) actor = new RightConveyor();
                if (kind == 3) actor = new LeftConveyor();
                if (kind == 4) actor = new Doritos();
                if (kind == 5) actor = new Robot();
                if (kind == 6) actor = new Portal();
//                 if (kind == 7) actor = new Brick();
//                 if (kind == 8) actor = new Brick();
                if (kind == 9) actor = new Hundreds();
                if (kind == 10) actor = new Tens();
                if (kind == 11) actor = new Ones();
                if (actor == null)continue;
                addObject(actor, 16+j*32, 16+i*32);
        }
    }
    public void nextLevel()
    {
        //Greenfoot.setWorld();
    }
}
