import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloseShop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloseShop extends Button
{
    public CloseShop(){
        super("Close", 0);
    }
    public void buy(){
        super.buy();
        ((Shop)getWorld()).resumeGame();
    }
}
