import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Increase Speed Button - buy bullet speed increase upgrades
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class IncSpeed extends Upgrades
{
    /**
     * creates a new upgrade button with name "Increase Speed"
     */
    public IncSpeed(){
        super("Increase Speed");
    }
    /**
     * upgrades bullet speed when bought
     */
    public void upgrade(){
        super.upgrade();
        Attacker.upgradeSpeed();
    }
    /**
     * @return boolean that represents whether or not the upgrades are at max level
     */
    public boolean isMaxLevel(){
        return getUpgradeLevel()==Attacker.spdArrLength()-1;
    }
}
