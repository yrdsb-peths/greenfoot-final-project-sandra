import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent class for buttons that change controls
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ChangeControls extends Button
{
    private static String[] images = {"bigbtn.png", "bigbtnclick.png"};
    private boolean isClicked;
    private String currentKey;
    public ChangeControls(String name){
        super(name, 0);
        isClicked = false;
    }
    public void act(){
        showText();
        if(Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(getLabel()) || isClicked){
            isClicked = true;
            upgrade();
        }
    }
    public void upgrade(){
        setImage(images[1]);
        currentKey = Greenfoot.getKey();
        if(currentKey == null || currentKey.equals(Attacker.getShootKey()) || currentKey.equals(BtnAmmo.getAmmoKey()) || currentKey.equals("tab")){
            changeName();
        }else{
            setKey();
            setImage(images[0]);
            isClicked = false;
        }
    }
    public void setKey(){
    }
    public void changeName(){
    }
    public String getCurrentKey(){
        return currentKey;
    }
}
