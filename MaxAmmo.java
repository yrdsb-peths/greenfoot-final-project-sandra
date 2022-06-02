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
        super("Ammo", 0, 20, 20);
    }
    public void act(){
        super.act();
        updateCost(((Worlds)getWorld()).getMoney()/10*10);
        showText();
    }
    protected void addedToWorld(){
        super.addedToWorld(getX(), getY()-35);
    }
    public void buy(){
        if(super.getBuyStatus()){
            Ammo.numAmmo+= getCost()/10;
            super.buy();
        }
    }
}
