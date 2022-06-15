import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Takes the user to instructions world.
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class InstructionsBtn extends TitleScreenButtons
{
    public InstructionsBtn(){
        super("Instructions");
    }
    public void upgrade(){
        Greenfoot.setWorld(new Instructions((Worlds)getWorld()));
    }
}
