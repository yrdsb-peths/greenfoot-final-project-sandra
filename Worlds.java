import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World to keep track of variables across multiple game worlds. 
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class Worlds extends World
{
    private static int money; //player's current balance
    private int labelX = 60; //X location for label at top left corner of screen
    private int labelY = 50; //Y location for label at top left corner of screen
    private static int level; //player level
    //boolean to ensure that player only levels up once when threshold is hit
    private boolean levelUp = false; 
    
    /**
     * constructor sets the initial values for player money and player level
     */
    public Worlds(int num, int num2, int num3)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(num, num2, num3);
        money = 10;
        level = 1;
    }
    public Worlds(int num, int num2, int num3, boolean bool)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(num, num2, num3, bool);
        money = 10;
        level = 1;
    }
    /**
     * updates the player balance
     */
    public static void updateMoney(int value){
        money +=value;
    }
    /**
     * @return money
     */
    public static int getMoney(){
        return money;
    }
    /**
     * @return top left corner label X coordinate
     */
    public int getLabelX(){
        return labelX;
    }
    public int getLabelY(){
        return labelY;
    }
    public static int getLevel(){
        return level;
    }
    public static void addLevel(int num){
        level+=num;
    }
    public void setLevelUp(boolean bool){
        levelUp = bool;
    }
    public boolean getLevelUp(){
        return levelUp;
    }
}
