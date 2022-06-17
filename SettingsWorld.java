import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Settings world to edit controls
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class SettingsWorld extends Worlds
{
    Worlds gameWorld;
    public SettingsWorld(Worlds world)
    {
        super(600, 400, 1);
        gameWorld = world;
        prepare();
    }
    public void prepare(){
        Button close = new CloseShop();
        addObject(close,546,35);
                
        Label controlsLabel = new Label("Controls", 50);
        controlsLabel.setLineColor(Label.MYCOLOUR);
        addObject(controlsLabel,300, 70);
        
        Button changeAmmo = new ChangeAmmo();
        addObject(changeAmmo, 300, 130);
        
        Button changeShoot = new ChangeShoot();
        addObject(changeShoot, 300, 210);
        
        Label musicLabel = new Label("Music", 50);
        musicLabel.setLineColor(Label.MYCOLOUR);
        addObject(musicLabel,300, 290);
        
        Button music = new MusicBtn();
        addObject(music, 300, 350);
    }
    public void resumeGame()
    {
        Greenfoot.setWorld(gameWorld);
    }
}
