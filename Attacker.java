import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Attacker class - represents the black attacker at the bottom and keeps track of upgrades
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class Attacker extends Actor
{
    private int counter; //counter for cooldown
    private boolean cooldown; //cooldown for true or false
    
    private static int[] speedUpgrades = {4, 7, 11}; //integer array for possible bullet speeds
    private static int speedIndex; //index of current upgrade
    
    private static int cdtime; //amount of cooldown time for shooting 
    private static int[] cdtimeUpgrades = {50, 25, 10, 5, 2}; //integer array for cooldown time upgrades
    private static int cdIndex; //index of current upgrade
    
    private static int[] strengthUpgrades = {1, 2, 5, 10, 15, 20, 25}; //integer array for strength of bullet upgrades
    private static int strengthIndex; //index of current upgrade
    
    /**
     * initialises all the array indices to 0
     * cooldown is on false
     * sets the initial speed, strength, and cdtime values
     */
    public Attacker(){
        cooldown = false;
        counter = 0;
        
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
        //checks if cooldown is active
        if(Greenfoot.isKeyDown("a") && cooldown){
            shoot();
            counter = 0;
            cooldown = false;
        }
        cooldownTimer();
        getWorld().showText("" + Ammo.numAmmo, getX(),getY()-10); //shows number of ammo in inventory
    }
    /**
     * timer to count cooldown time
     */
    public void cooldownTimer(){
        counter++;
        if(!cooldown && counter>cdtime){
            cooldown = true;
        }
    }
    /**
     * makes the attacker rotate towards the cursor
     */
    public void followCursor(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null && mouse.getY()<380){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    /**
     * fires off a bullet
     */
    private void shoot(){
        if(Ammo.numAmmo>0){
            Ammo ammo = new Ammo(getRotation());
            getWorld().addObject(ammo, getWorld().getWidth()/2,getWorld().getHeight());
        }
    }
    /**
     * increments the cooldown time upgrade index 
     */
    public static void upgradeCd(){
        cdIndex++;
        cdtime = cdtimeUpgrades[cdIndex];
    }
    /**
     * increments the strength upgrade index 
     */
    public static void upgradeStrength(){
        strengthIndex++;
        Ammo.strength = strengthUpgrades[strengthIndex];
    }
    /**
     * increments the speed time upgrade index 
     */
    public static void upgradeSpeed(){
        speedIndex++;
        Ammo.speed = speedUpgrades[speedIndex];
    }
    /**
     * returns the length of the cooldown upgrades array
     */
    public static int cdArrLength(){
        return cdtimeUpgrades.length;
    }
    /**
     * returns the length of the strenght upgrades array
     */
    public static int strengthArrLength(){
        return strengthUpgrades.length;
    }
    /**
     * returns the length of the speed upgrades array
     */
    public static int spdArrLength(){
        return speedUpgrades.length;
    }
}
