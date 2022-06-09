     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Upgrades Class - Outline for all upgrade buttons
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class Upgrades extends Button
{
    private int upgradeLevel; //index of price in prices
    private int[] prices = {100, 200, 400, 700, 1100, 1700, 2500, 3000, 3700}; //array for prices of upgrades as player progresses
    /**
     * creates any upgrade buttons with initial prices.
     */
    public Upgrades(String name){
        super(name, 0);
        upgradeLevel = 0;
        updateCost(prices[upgradeLevel]);
    }
    /**
     * returns whether or not the player can purchase the upgrade
     */
    public boolean canBuy(){
        if(isMaxLevel()){
            return false;
        }else{
            return super.canBuy();
        }
    }
    /**
     * increases the price of the next upgrade
     * if the current upgrade is the maximum, sets the image to clicked and updates the name to indicate that the upgrade
     *  is maxed out
     */
    public void upgrade(){
        upgradeLevel++;
        updateCost(prices[upgradeLevel]);
        if(isMaxLevel()){
            setImage("bigbtnclick.png");
            setName(getName() + " - Max Level");
            updateCost(0);
        }
    }
    /**
     * placeholder for use of this method in the subclasses
     */
    public boolean isMaxLevel(){
        return false;
    }
    /**
     * returns the current upgrade level
     */
    public int getUpgradeLevel(){
        return upgradeLevel;
    }
}
