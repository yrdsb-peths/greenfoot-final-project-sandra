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
        gameOverLabel.setLineColor(Label.MYCOLOUR);
        addObject(gameOverLabel, 300, 180);
        
        Label scoreLabel = new Label("Level: " + (MyWorld.getScore()/50+1) + "    Score: " + MyWorld.getScore(), 50);
        scoreLabel.setFillColor(Label.MYCOLOUR);
        scoreLabel.setLineColor(Label.TRANSPARENT);
        addObject(scoreLabel, 300, 250);
    }
}
