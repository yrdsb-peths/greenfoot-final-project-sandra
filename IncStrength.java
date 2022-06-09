import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Increase Strength Button - buys increase strength upgrades
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class IncStrength extends Upgrades
{
    /**
     * makes a new upgrade button with name "Increase Strength"
     */
    public IncStrength(){
        super("Increase Strength");
    }
    /**
     * upgrades bullet strength when bought
     */
    public void upgrade(){
        super.upgrade();
        Attacker.upgradeStrength();
    }
    /**
     * @return  a boolean representing whether or not the upgrades are maxed out
     */
    public boolean isMaxLevel(){
        return getUpgradeLevel()==Attacker.strengthArrLength()-1;
    }
}
