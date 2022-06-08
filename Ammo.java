import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends Actor
{
    public static int speed; //speed of bullets
    public static int strength; //strength of bullets
    public static int numAmmo; //current number of bullets that are not fired
    /**
     * Sets the default rotation of the bullet and
     * decrements the total amount of bullets by 1
     */
    public Ammo(int rotation){
        if(!Mute.muted){
            Greenfoot.playSound("shootsound.wav");
        }
        setRotation(rotation);
        numAmmo--;
    }
    /**
     * This makes the bullet move forward
     */
    public void act()
    {
        move(speed);
        if(getY() < 0){
            getWorld().removeObject(this);
        }
    }
    /**
     * increases the speed of the bullets
     * @param num   the speed to increase by
     */
    public static void increaseSpeed(int num){
        speed+=num;
    }
    /**
     * increases the strength of the ammo class
     * @param num   the strength to increase by
     */
    public static void increaseStrength(int num){
        strength+=num;
    }
    /**
     * @return the current strength of the bullet
     */
    public static int getStrength(){
        return strength;
    }
}
