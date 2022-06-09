import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Decrease Cooldown Button - buy cooldown decrease upgrades
 * 
 * @author Sandra Huang 
 * @version June 2022
 */
public class DecCd extends Upgrades
{
    /**
     * creates an upgrade button with name "Decrease Cooldown"
     */
    public DecCd(){
        super("Decrease Cooldown");
    }
    /**
     * upgrades cooldown time when bought
     */
    public void upgrade(){
        super.upgrade();
        Attacker.upgradeCd();
    }
    /**
     * @return  a boolean that represents whether or not the the button is maxed out
     */
    public boolean isMaxLevel(){
        return getUpgradeLevel()==Attacker.cdArrLength()-1;
    }
}
