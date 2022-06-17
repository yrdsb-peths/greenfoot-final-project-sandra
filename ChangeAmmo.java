import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Changes the ammo-purchasing-button keyboard shortcut
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ChangeAmmo extends ChangeControls
{
    public ChangeAmmo(){
        super("Buying Ammo: " + BtnAmmo.getAmmoKey());
    }
    /**
     * Sets the ammo purchasing key to the user input key
     */
    public void setKey(){
        BtnAmmo.setAmmoKey(getCurrentKey());
    }
    /**
     * changes the name of the button, depending on whether or not it is clicked
     */
    public void changeName(){
        if(getIsClicked()){
            setName("Change Key To: " + BtnAmmo.getAmmoKey());
        }else{
            setName("Buying Ammo: " + BtnAmmo.getAmmoKey());
        }
    }
}
