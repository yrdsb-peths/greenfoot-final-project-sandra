import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Takes the user to the settings menu
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class SettingsBtn extends Button
{
    public SettingsBtn(){
        super("Settings", 0);
        getImage().scale(80, 50);
    }
    public void upgrade(){
        Greenfoot.setWorld(new SettingsWorld((Worlds)getWorld()));
    }
}
