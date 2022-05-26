import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IncSpeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IncSpeed extends Upgrades
{
    public IncSpeed(){
        super("Increase Speed");
    }
    public void buy(){
        super.buy();
        Attacker.upgradeSpeed();
    }
}
