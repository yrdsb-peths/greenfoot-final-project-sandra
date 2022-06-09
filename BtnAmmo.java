import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ammo Button Class - purchases ammo one by one
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class BtnAmmo extends Button
{
    /**
     * creates a button with name "Ammo" and price $10
     */
    public BtnAmmo(){
        super("Ammo", 10);
    }
    /**
     * adds one ammo when purchased
     */
    public void upgrade(){
        super.upgrade();
        Ammo.numAmmo++;
    }
}
