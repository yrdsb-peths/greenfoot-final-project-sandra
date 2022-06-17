import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Changes the keyboard key you have to click to shoot
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ChangeShoot extends ChangeControls
{
    public ChangeShoot(){
        super("Shooting: " + Attacker.getShootKey());
    }
    /**
     * Sets the shooting key to the user input key
     */
    public void setKey(){
        Attacker.setShootKey(getCurrentKey());
    }
    /**
     * changes the name of the button, depending on whether or not it is clicked
     */
    public void changeName(){
        if(getIsClicked()){
            setName("Change Key To: " + Attacker.getShootKey());
        }else{
            setName("Shooting: " + Attacker.getShootKey());
        }
    }
}
