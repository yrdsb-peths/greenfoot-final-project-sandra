import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChangeShoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangeShoot extends ChangeControls
{
    public ChangeShoot(){
        super("Shooting Keyboard Key: " + Attacker.getShootKey());
    }
    public void setKey(){
        Attacker.setShootKey(getCurrentKey());
        setName("Shooting Keyboard Key: " + Attacker.getShootKey());
    }
    public void changeName(){
        
        setName("Current Key: " + Attacker.getShootKey());
    }
}
