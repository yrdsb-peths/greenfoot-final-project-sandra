import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends Worlds
{
    private static int score;
    private Shop shop;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        shop = new Shop(this);
        score = 0;
        prepare();        
    }
    public void spawnEnemy()
    {
        Enemy enemy = new Enemy (getLevel() + Greenfoot.getRandomNumber(getLevel())/2);
        addObject(enemy, Greenfoot.getRandomNumber(getWidth()), 0);
    }
    private void prepare()
    {
        showText("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + getMoney(), getLabelX(), getLabelY());

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
    public void addScore(int num){
        score+=num;
        updateMoney(10+num);
    }
    public void act(){
        showText(null, getLabelX(), getLabelY());
        if(score!=0 && score>=50*getLevel() && !getLevelUp()){
            addLevel(1);
            setLevelUp(true);
            Enemy.setMaxEnemies(getLevel()/2);
        }
        showText("Level " + getLevel() + "\nScore: " + score+"\nMoney: " + super.getMoney(), getLabelX(), getLabelY());
        if(Enemy.numEnemies<Enemy.maxNumEnemies && Greenfoot.getRandomNumber(15)==5){
            spawnEnemy();
        }
    }
    public Shop getShop()
    {
        return shop;
    }
    public static int getScore(){
        return score;
    }
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
    }
}
