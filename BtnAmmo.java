import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnAmmo extends Button
{
    public BtnAmmo(){
        super("Ammo", 10);
    }
    public void buy(){
        super.buy();
        if(super.canBuy()){
            Ammo.numAmmo++;
        }
    }
}
