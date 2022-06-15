import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Worlds
{

    private Worlds titleWorld;
    public Instructions(Worlds titleWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.titleWorld = titleWorld;
        prepare();
    }
    private void prepare(){
        CloseShop close = new CloseShop();
        addObject(close,546,35);
        
        Label line1 = new Label("Press <a> to shoot and move mouse to aim", 30);        
        line1.setLineColor(Label.TRANSPARENT);
        addObject(line1, 300, 120);
        
        Label line2 = new Label("Go to the shop to buy upgrades", 30);
        line2.setLineColor(Label.TRANSPARENT);
        addObject(line2, 300, 160);
        
        Label line3 = new Label("Press shift or press on the button to buy ammo", 30);
        line3.setLineColor(Label.TRANSPARENT);
        addObject(line3, 300, 200);
        
        Label line4 = new Label("Good luck!", 50);
        line4.setFillColor(Label.MYCOLOUR);
        line4.setLineColor(Label.TRANSPARENT);
        addObject(line4, 300, 250);
    }
    public void resumeGame()
    {
        Greenfoot.setWorld(titleWorld);
    }
}
