import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worlds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worlds extends World
{
    private static int money;
    private int labelX = 60;
    private int labelY = 40;
    private static int level;
    private boolean levelUp = false;
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
    }
    public void updateMoney(int value){
        money +=value;
    }
    public int getMoney(){
        return money;
    }
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
