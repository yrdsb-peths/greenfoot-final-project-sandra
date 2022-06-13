import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Max Ammo Button - buys up to 10 ammo, depends on how much the player can afford
 * 
 * @author Sandra Huang 
 * @version June 2022
 */
public class MaxAmmo extends Button
{
    public MaxAmmo(){
        super("Buy", 0);
    }
    public void act(){
        super.act();
        //if the player has under 100 money, set cost + name to 
        //max number the player can buy. 
        //else, set cost + name to buy 10, cost 100
        if(((Worlds)getWorld()).getMoney()<100){
            updateCost(((Worlds)getWorld()).getMoney()/10*10);
            setName("Buy " + ((Worlds)getWorld()).getMoney()/10);
        }else{
            if(getCost()!=100){
                updateCost(100);
                setName("Buy " + 10);
            }
        }
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
