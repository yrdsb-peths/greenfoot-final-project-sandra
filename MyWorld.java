import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends Worlds
{
    private static int score; //player score
    private Shop shop; //Shop world to keep track of
    private Label label;
    /**
     * creates the game world
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        shop = new Shop(this);
        score = 0;
        prepare();        
    }
    /**
     * prepares the world with text, a single enemy, and all the game buttons
     */
    private void prepare()
    {
        label = new Label("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + getMoney(), 25);
        addObject(label, getLabelX(), getLabelY());
        
        Attacker attacker = new Attacker();
        addObject(attacker,getWidth()/2,getHeight());
        showText("" + Ammo.numAmmo, getWidth()/2,getHeight()-10);

        spawnEnemy();
        Enemy.setMaxEnemies(1);
        
        BtnAmmo btnAmmo = new BtnAmmo();
        addObject(btnAmmo,56,366);
        btnAmmo.showText();

        ShopBtn shopBtn = new ShopBtn();
        addObject(shopBtn,546,35);
        shopBtn.showText();

        MaxAmmo maxAmmo = new MaxAmmo();
        addObject(maxAmmo,56,304);
    }
    /**
     * shows and updates the score
     * also keeps track of level up
     * randomly spawns an enemy IF the number of enemies is not the current maximum
     */
    public void act(){
        if(score!=0 && score>=50*getLevel() && !getLevelUp()){
            addLevel(1);
            setLevelUp(true);
            Enemy.setMaxEnemies(getLevel()/2);
        }
        label.setValue("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + super.getMoney());
        if(Enemy.numEnemies<Enemy.maxNumEnemies && Greenfoot.getRandomNumber(15)==5){
            spawnEnemy();
        }
    }
    /**
     * spawns an enemy
     */
    public void spawnEnemy()
    {
        //sets number of enemy lives to a random number that scales on the game level
        Enemy enemy = new Enemy (getLevel() + Greenfoot.getRandomNumber(getLevel())/2);
        addObject(enemy, Greenfoot.getRandomNumber(getWidth()), 0);
    }
    /**
     * increments the score
     * @param num   the number to increment the score by
     */
    public void addScore(int num){
        score+=num;
        updateMoney(10+num);
    }
    /**
     * returns the shop of the world
     */
    public Shop getShop()
    {
        return shop;
    }
    /**
     * returns the player score 
     */
    public static int getScore(){
        return score;
    }
    /**
     * sets the world to game over
     */
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
    }
}
