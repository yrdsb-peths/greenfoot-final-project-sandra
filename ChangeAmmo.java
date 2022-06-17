import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Changes the ammo purchasing button keyboard shortcut
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ChangeAmmo extends ChangeControls
{
    public ChangeAmmo(){
        super("Buying Ammo: " + BtnAmmo.getAmmoKey());
    }
    public void setKey(){
        BtnAmmo.setAmmoKey(getCurrentKey());
        setName("Buying Ammo: " + BtnAmmo.getAmmoKey());
    }
    public void changeName(){
        setName("Current Key: " + BtnAmmo.getAmmoKey());
    }
}
