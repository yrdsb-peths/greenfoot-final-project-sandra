import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Close Shop Button - closes the shop
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class CloseShop extends Button
{
    public CloseShop(){
        super("Close", 0);
    }
    public void buy(){
        super.buy(); //to play sound
        ((Shop)getWorld()).resumeGame();
    }
}
