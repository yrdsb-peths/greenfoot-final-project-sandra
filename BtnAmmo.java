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
        if((Greenfoot.isKeyDown("shift")) && canBuy() && cooldown>10){
            buy();
            cooldown = 0;
        }
    }
}
