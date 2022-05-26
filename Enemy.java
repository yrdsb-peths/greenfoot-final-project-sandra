import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int lives;
    public static int maxNumEnemies;
    public static int numEnemies;
    
    public Enemy(int lives){
        this.lives = lives;
        numEnemies ++;
        speed = 1;
        //make it so that, if a certain number of upgrades are bought, speed increases a certain amount.
    }
    public void act() 
    {
        if(this!=null){
            MyWorld world = (MyWorld) getWorld();
            showText(null, world);
            int x = getX();
            int y = getY();
            setLocation(x, y + speed);
            showText("" + lives, world);
            if(getY() > world.getHeight()){
                showText(null, world);
                world.gameOver();
                world.removeObject(this);
            }else{
                getShot();   
            }
        }
    }
    public void getShot(){
        if(isTouching(Ammo.class)){
            int curLives = lives;
            removeTouching(Ammo.class);
            lives -= Ammo.getStrength();
            MyWorld world = (MyWorld) getWorld();
            world.addScore(curLives*2);
            world.setLevelUp(false);
            if(lives<=0){
                showText(null, world);
                world.addScore(3);
                world.spawnEnemy();
                numEnemies--;
                world.removeObject(this);
            }
        }
    }
    private void showText(String value, World world){
        world.showText(value, getX(), getY() + 4);
    }
    public static void setMaxEnemies(int num){
        maxNumEnemies = num;
    }
}
