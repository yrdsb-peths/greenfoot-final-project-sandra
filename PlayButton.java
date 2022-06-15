import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Takes the user to the game world
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class PlayButton extends TitleScreenButtons
{
    public PlayButton(){
        super("Play");
    }
    public void upgrade(){
        Greenfoot.setWorld(new GameWorld());
    }
}
