import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IncStrength here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IncStrength extends Upgrades
{
    public IncStrength(){
        super("Increase Strength");
    }
    public void buy(){
        super.buy();
        Attacker.upgradeStrength();
    }
}
