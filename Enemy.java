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
        label = new Label(lives, 25);
        label.setLineColor(Label.TRANSPARENT);
    }
    /**
     * adds the label at the location of the enemy
     */
    public void addedToWorld(World world){
        getWorld().addObject(label, getX(), getY() + 5);
    }
    public void act() 
    {
        if(this!=null){
            GameWorld world = (GameWorld) getWorld();
            //showText(null, world);
            
            //moves both the enemy and the label down
            this.setLocation(getX(), getY() + speed);
            label.setLocation(label.getX(), label.getY() + speed);
            
            //showText("" + lives, world); //displays the number of lives the enemy has
            label.setValue(lives); //updates the number of lives the enemy has
            
            //removes the current object and sets the world to game over if the enemy is offscreen
            if(getY() > world.getHeight()){
                world.removeObject(label); //removes the text
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
            GameWorld world = (GameWorld) getWorld();
            world.addScore(curLives*2);
            world.setLevelUp(false);
            if(lives<1){
                world.removeObject(label); //removes the text
                world.addScore(3);
                numEnemies--;
                if(numEnemies == 0){
                    world.spawnEnemy();
                }
                world.removeObject(this);
            }
        }
    }
    /**
     * @param num   number of max enemies to be set
     */
    public static void setMaxEnemies(int num){
        maxNumEnemies = num;
    }
}
