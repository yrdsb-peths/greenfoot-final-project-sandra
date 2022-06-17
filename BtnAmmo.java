import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ammo Button Class - purchases ammo one by one
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class BtnAmmo extends Button
{
    private int cooldown;
    private static String ammoKey = "shift";
    public BtnAmmo(){
        super("Ammo", 10);
        cooldown = 0;
    }
    /**
     * adds one ammo when purchased
     */
    public void upgrade(){
        super.upgrade();
        Ammo.numAmmo++;
    }
    public void act()
    {
        super.act();
        cooldown++;
        if((Greenfoot.isKeyDown(ammoKey)) && canBuy() && cooldown>10){
            buy();
            cooldown = 0;
        }
    }
    /**
     * sets the keyboard key to buy ammo
     */
    public static void setAmmoKey(String str){
        ammoKey = str;
    }
    /**
     * gets the keyboard key that buys ammo
     */
    public static String getAmmoKey(){
        return ammoKey;
    }
}
