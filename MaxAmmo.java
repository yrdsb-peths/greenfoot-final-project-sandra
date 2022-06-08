import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MaxAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaxAmmo extends Button
{
    public MaxAmmo(){
        super("Buy 1", 0);
    }
    public void act(){
        super.act();
        updateCost(((Worlds)getWorld()).getMoney()/10*10);
        setName("Buy " + ((Worlds)getWorld()).getMoney()/10);
    }
    public void buy(){
        if(super.canBuy() && getCost() != 0){
            Ammo.numAmmo+= getCost()/10;
            super.buy();
        }
    }
}
