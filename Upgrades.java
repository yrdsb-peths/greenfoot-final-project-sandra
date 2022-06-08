     import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrades extends Button
{
    private int upgradeLevel; //index of price in prices
    private int[] prices = {100, 200, 400, 700}; //array for prices of upgrades as player progresses
    public Upgrades(String name){
        super(name, 0);
        upgradeLevel = 0;
        updateCost(prices[upgradeLevel]);
    }
    public void buy(){
        super.buy();
        if(canBuy()){
            upgradeLevel++;
            updateCost(prices[upgradeLevel]);
            if(isMaxLevel()){
                setImage("bigbtnclick.png");
                setName(getName() + " - Max Level");
                updateCost(0);
            }
        }
    }
    public boolean canBuy(){
        if(isMaxLevel()){
            return false;
        }else{
            return super.canBuy();
        }
    }
    public boolean isMaxLevel(){
        return upgradeLevel==prices.length-1;
    }
    public void act(){
        super.act();
    }
    public int getUpgradeLevel(){
        return upgradeLevel;
    }
}
