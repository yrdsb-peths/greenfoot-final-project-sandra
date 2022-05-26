import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends Worlds
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {
        super(600, 400, 1); 
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
        
        Label scoreLabel = new Label("Score: " + MyWorld.getScore(), 80);
        addObject(scoreLabel, 300, 280);
    }
}
