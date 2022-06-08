import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mute extends Button
{
    public static boolean muted = false;
    public Mute(){
        super("Mute", 0);
    }
    protected void addedToWorld(World world){
        super.addedToWorld(world);
        if(muted){
            setName("Unmute");
        }else{
            setName("Mute");
        }
    }
    public void buy(){
        muted = !muted;
        if(muted){
            setName("Unmute");
        }else{
            setName("Mute");
        }
    }
}
