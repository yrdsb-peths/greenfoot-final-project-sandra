import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicBtn extends Button
{
    private String[] names = {"", "", ""};
    private String[] files = {"", "", ""};
    private int index = 0;
    
    public MusicBtn(){
        super("NOT CURRENTLY FUNCTIONAL", 0);
    }
    protected void addedToWorld(World world){
        super.addedToWorld(world);
        //setName("Track " + (index+1) + "- " + names[index]);
    }
}
