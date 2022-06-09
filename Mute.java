import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mute button class - mutes/unmutes the game
 * 
 * @author Sandra Huang 
 * @version June 2022
 */
public class Mute extends Button
{
    public static boolean muted = false;
    /**
     * creates a button with name mute and price 0
     */
    public Mute(){
        super("Mute", 0);
    }
    /**
     * keeps the mute status from last reset
     */
    protected void addedToWorld(World world){
        super.addedToWorld(world);
        if(muted){
            setName("Unmute");
        }else{
            setName("Mute");
        }
    }
    /**
     * changes status from muted to unmuted; from unmuted to muted
     */
    public void buy(){
        muted = !muted;
        if(muted){
            setName("Unmute");
        }else{
            setName("Mute");
        }
    }
}
