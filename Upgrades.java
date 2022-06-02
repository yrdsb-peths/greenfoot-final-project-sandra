     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrades extends Button
{
    private int upgradeLevel;
    private int[] prices = {100, 300, 500, 800};
    public Upgrades(String name){
        super(name, 0, 400, 70);
        upgradeLevel = 0;
        updateCost(prices[upgradeLevel]);
    }
    public void buy(){
        super.buy();
        upgradeLevel++;
        updateCost(prices[upgradeLevel]);
    }
    public void act(){
        super.act();
        showText();
    }
    public int getUpgradeLevel(){
        return upgradeLevel;
    }
}
