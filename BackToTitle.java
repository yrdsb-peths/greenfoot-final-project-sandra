import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Takes the user back to the title screen
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class BackToTitle extends TitleScreenButtons
{
    public BackToTitle(){
        super("Back To Title");
    }
    public void upgrade(){
        Greenfoot.setWorld(new TitleScreenWorld());
    }
}
