import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attacker extends Actor
{
    private int counter; //counter for cooldown
    private boolean cooldown; //cooldown for true or false
    
    private static int[] speedUpgrades = {4, 6, 8, 9}; //integer array for possible bullet speeds
    private static int speedIndex; //index of current upgrade
    
    private static int cdtime; //amount of cooldown time for shooting 
    private static int[] cdtimeUpgrades = {40, 30, 20, 15}; //integer array for cooldown time upgrades
    private static int cdIndex; //index of current upgrade
    
    private static int[] strengthUpgrades = {1, 2, 3, 4}; //integer array for strenght of bullet upgrades
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
}
