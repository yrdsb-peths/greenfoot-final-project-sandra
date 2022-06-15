import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreenWorld.
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class TitleScreenWorld extends Worlds
{

    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("2D Shooter Game", 80);
        titleLabel.setLineColor(Label.MYCOLOUR);
        addObject(titleLabel,300, 120);
        
        Button playButton = new PlayButton();
        addObject(playButton, 300, 200);
        
        Button howToPlay = new InstructionsBtn();
        addObject(howToPlay, 300, 290);
    }
}