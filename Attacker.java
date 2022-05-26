import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attacker extends Actor
{
    private int counter;
    private boolean cooldown;
    
    private static int[] speedUpgrades = {4, 6, 8, 9};
    private static int speedIndex;
    
    private static int cdtime;
    private static int[] cdtimeUpgrades = {40, 30, 20, 15};
    private static int cdIndex;
    
    private static int[] strengthUpgrades = {1, 2, 3, 4};
    private static int strengthIndex;
    
    public Attacker(){
        cooldown = false;
        counter = 0;
        
        Ammo.score = 0;
        
        speedIndex = 0;
        Ammo.speed = speedUpgrades[speedIndex];
        
        strengthIndex = 0;
        Ammo.strength = strengthUpgrades[strengthIndex];
        
        Ammo.numAmmo = 10;
        
        cdIndex = 0;
        cdtime = cdtimeUpgrades[cdIndex];
    }
    public void act()
    {
        getWorld().showText(null, getX(),getY()-10);
        followCursor();
        if(Greenfoot.isKeyDown("a") && cooldown){
            shoot();
            counter = 0;
            cooldown = false;
        }
        cooldownTimer();
        getWorld().showText("" + Ammo.numAmmo, getX(),getY()-10);
    }
    public void cooldownTimer(){
        counter++;
        if(!cooldown && counter>cdtime){
            cooldown = true;
        }
    }
    public void followCursor(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null && mouse.getY()<380){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    private void shoot(){
        if(Ammo.numAmmo>0){
            Ammo ammo = new Ammo(getRotation());
            getWorld().addObject(ammo, getWorld().getWidth()/2,getWorld().getHeight());
        }
    }
    public static void upgradeCd(){
        cdIndex++;
        cdtime = cdtimeUpgrades[cdIndex];
    }
    public static void upgradeStrength(){
        strengthIndex++;
        Ammo.strength = strengthUpgrades[strengthIndex];
    }
    public static void upgradeSpeed(){
        speedIndex++;
        Ammo.speed = speedUpgrades[speedIndex];
    }
}
