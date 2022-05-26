import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreenWorld.
 * 
 * @author Chan
 * @version May 2022
 */
public class TitleScreenWorld extends World
{

    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Ant Shooter Game", 70);
        addObject(titleLabel,300, 150);
        Label instructionLabel = new Label("Press <space> to begin", 50);
        addObject(instructionLabel, 300, 230);
        
        Label howToPlay = new Label("<a> to shoot and move mouse to aim", 30);
        addObject(howToPlay, 300, 270);
    }
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}