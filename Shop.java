import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends Worlds
{
    private MyWorld gameWorld;
    private Worlds world;

    public Shop(MyWorld world)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        gameWorld = world;
        prepare();
    }

    private void prepare(){
        showText("Money: " + getMoney(), getLabelX(), getLabelY()-20);
        
        CloseShop close = new CloseShop();
        addObject(close,546,35);
        close.showText();
        
        DecCd deccd = new DecCd();
        addObject(deccd, 300, 120);
        
        IncSpeed incspeed = new IncSpeed();
        addObject(incspeed, 300, 220);
        
        IncStrength incstr = new IncStrength();
        addObject(incstr, 300, 320);
    }
    
    public void act(){
        showText("Money: " + getMoney(), getLabelX(), getLabelY()-20);
    }
    
    public void resumeGame()
    {
        Greenfoot.setWorld(gameWorld);
    }
}
