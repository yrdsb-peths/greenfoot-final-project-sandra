import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int speed = 1; //keeps track of enemy speed
    private int lives; //number of lives the current enemy has
    public static int maxNumEnemies; //maximum number of enemies in the world
    public static int numEnemies; //current number of enemies in the world
    private Label label;
    /**
     * @param lives     the number of lives the enemy has
     */
    public Enemy(int lives){
        this.lives = lives;
        numEnemies ++;
    }
    public void act() 
    {
        if(this!=null){
            MyWorld world = (MyWorld) getWorld();
            showText(null, world);
            int x = getX();
            int y = getY();
            setLocation(x, y + speed);
            showText("" + lives, world); //displays the number of lives the enemy has
            
            //removes the current object and sets the world to game over if the enemy is offscreen
            if(getY() > world.getHeight()){
                showText(null, world);
                world.gameOver();
                world.removeObject(this);
            }else{
                getShot();
            }
        }
    }
    /**
     * checks if enemy is touching a bullet. If so, removes a life.
     * If the enemy has less than one life, removes the enemy from the screen
     */
    public void getShot(){
        if(isTouching(Ammo.class)){
            int curLives = lives;
            removeTouching(Ammo.class);
            lives -= Ammo.getStrength();
            MyWorld world = (MyWorld) getWorld();
            world.addScore(curLives*2);
            world.setLevelUp(false);
            if(lives<1){
                showText(null, world);
                world.addScore(3);
                world.spawnEnemy();
                numEnemies--;
                world.removeObject(this);
            }
        }
    }
    /**
     * overridden showText method to ensure that the value is shown on the right part of the enemy
     */
    private void showText(String value, World world){
        world.showText(value, getX(), getY() + 4);
    }
    /**
     * @param num   number of max enemies to be set
     */
    public static void setMaxEnemies(int num){
        maxNumEnemies = num;
    }
}
