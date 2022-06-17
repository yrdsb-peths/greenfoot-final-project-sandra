import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game world
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class GameWorld extends Worlds
{
    private static int score; //player score
    private Shop shop; //Shop world to keep track of
    private Label label; //label to display score, money, level
    private SettingsWorld settings; 
    /**
     * creates the game world
     */
    public GameWorld()
    {    
        super(600, 400, 1, false);
        shop = new Shop(this);
        settings = new SettingsWorld(this);
        score = 0;
        prepare();        
    }
    /**
     * prepares the world with text, a single enemy, and all the game buttons
     */
    private void prepare()
    {
        //display score, money, level
        label = new Label("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + getMoney(), 25);
        label.setLineColor(Label.TRANSPARENT);
        addObject(label, getLabelX(), getLabelY());
        
        //spawn attacker, display number of ammo on attacker
        Attacker attacker = new Attacker();
        addObject(attacker,getWidth()/2,getHeight());
        showText("" + Ammo.numAmmo, getWidth()/2,getHeight()-10);
        
        //add ammo button
        Button btnAmmo = new BtnAmmo();
        addObject(btnAmmo,56,304);;

        //add shop button
        Button shopBtn = new ShopBtn();
        addObject(shopBtn,546,35);

        //add mute button
        Button mute = new Mute();
        addObject(mute, 470, 35);
        
        //add buy ammo button
        Button maxAmmo = new MaxAmmo();
        addObject(maxAmmo,56, 366);
        
        //add settings buton
        Button settings = new SettingsBtn();
        addObject(settings, 540, 366);
        
        //spawn an initial enemy, set initial enemy number to 1
        Enemy.numEnemies = 0;
        spawnEnemy();
        Enemy.setMaxEnemies(1);
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
            Enemy.setMaxEnemies((   getLevel()+5)/5);
        }
        label.setValue("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + super.getMoney());
        if(Enemy.numEnemies<Enemy.maxNumEnemies && Greenfoot.getRandomNumber(200)<1){
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
    /**
     * @return the settings world
     */
    public SettingsWorld getSettingsWorld(){
        return settings;
    }
}
