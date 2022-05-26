import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends Actor
{
    public static int speed;
    public static int score;
    public static int strength;
    public static int numAmmo;
    public void act()
    {
        move(speed);
        if(getY() < 0){
            getWorld().removeObject(this);
        }
    }
    public Ammo(int rotation){
        setRotation(rotation);
        numAmmo--;
    }
    public static void increaseSpeed(int num){
        speed+=num;
    }
    public static void increaseStrength(int num){
        strength+=num;
    }
    public static int getStrength(){
        return strength;
    }
}
