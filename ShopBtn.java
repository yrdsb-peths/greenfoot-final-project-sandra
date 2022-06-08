import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopBtn extends Button
{
    public ShopBtn(){
        super("Shop", 0);
    }
    public void act()
    {
        super.act();
        showText();
    }
    public void buy(){
        super.buy();
        Greenfoot.setWorld(((GameWorld)getWorld()).getShop());
    }
}
