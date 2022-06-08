import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DecCd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DecCd extends Upgrades
{
    public DecCd(){
        super("Decrease Cooldown");
    }
    public void buy(){
        super.buy();
        if(super.canBuy()){
            Attacker.upgradeCd();
        }
    }
}
