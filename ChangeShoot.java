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
        super("Shooting: " + Attacker.getShootKey());
    }
    public void setKey(){
        Attacker.setShootKey(getCurrentKey());
        setName("Shooting: " + Attacker.getShootKey());
    }
    public void changeName(){
        
        setName("Current Key: " + Attacker.getShootKey());
    }
}
