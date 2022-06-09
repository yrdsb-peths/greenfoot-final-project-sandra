import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Max Ammo Button - buys the maximum number of ammo the player can afford
 * 
 * @author Sandra Huang 
 * @version June 2022
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
            super.buy();
        }
    }
    /**
     * adds the appropriate number of ammo to the player's inventory
     */
    public void upgrade(){
        Ammo.numAmmo+= getCost()/10; 
    }
}
