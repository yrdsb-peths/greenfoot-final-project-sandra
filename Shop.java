import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shop world to purchase upgrades in-game
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class Shop extends Worlds
{
    private GameWorld gameWorld; //makes sure that progress in game world is saved
    private Label label;
    
    public Shop(GameWorld world)
    {    
        super(600, 400, 1); 
        gameWorld = world;
        prepare();
    }
    /**
     * prepares the shop with all necessary buttons and label in corner for money
     */
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
    /**
     * updates the money label
     */
    public void act(){
        label.setValue("Money: " + getMoney());
    }
    /**
     * goes back to the game world
     */
    public void resumeGame()
    {
        Greenfoot.setWorld(gameWorld);
    }
}
