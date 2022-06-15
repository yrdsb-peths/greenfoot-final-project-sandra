import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game over world
 * 
 * @author Sandra Huang
 * @version June 2022
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
        addObject(gameOverLabel, 300, 160);
        
        Label scoreLabel = new Label("Level: " + (GameWorld.getScore()/50+1) + "    Score: " + GameWorld.getScore(), 50);
        scoreLabel.setFillColor(Label.MYCOLOUR);
        scoreLabel.setLineColor(Label.TRANSPARENT);
        addObject(scoreLabel, 300, 215);
        
        Button backToTitle = new BackToTitle();
        addObject(backToTitle, 300, 290);
    }
}
