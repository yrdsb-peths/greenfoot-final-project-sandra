import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shop Button - brings the player into the shop
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ShopBtn extends Button
{
    /**
     * creates a button with name "Shop" and price of 0
     */
    public ShopBtn(){
        super("Shop", 0);
    }
    /**
     * sets the player's world to shop when clicked on
     */
    public void upgrade(){
        Greenfoot.setWorld(((GameWorld)getWorld()).getShop());
    }
}
