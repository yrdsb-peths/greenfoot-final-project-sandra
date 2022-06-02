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
    private Label label;
    
    public Shop(MyWorld world)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        gameWorld = world;
        prepare();
    }

    private void prepare(){
        label = new Label("Money: " + getMoney(), 25);
        label.setLineColor(new Color(0, 0, 0, 0));
        addObject(label, getLabelX(), getLabelY()-15);
        
        CloseShop close = new CloseShop();
        addObject(close,546,35);
        
        DecCd deccd = new DecCd();
        addObject(deccd, 300, 120);
        
        IncSpeed incspeed = new IncSpeed();
        addObject(incspeed, 300, 220);
        
        IncStrength incstr = new IncStrength();
        addObject(incstr, 300, 320);
    }
    
    public void act(){
        label.setValue("Money: " + getMoney());
    }
    
    public void resumeGame()
    {
        Greenfoot.setWorld(gameWorld);
    }
}
