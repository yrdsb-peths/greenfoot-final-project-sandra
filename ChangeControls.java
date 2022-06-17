import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent class for buttons that change controls
 * 
 * @author Sandra Huang
 * @version June 2022
 */
public class ChangeControls extends Button
{
    private static String[] images = {"bigbtn.png", "bigbtnclick.png"}; //array for images - clicked and unclicked
    private boolean isClicked; //status of the button - is it clicked or not clicked?
    private String currentKey; //current key that the control is set to
    private int counter; //counter to keep track of time
    public ChangeControls(String name){
        super(name, 0);
        isClicked = false;
        counter = 0;
    }
    public void act(){
        showText();
        //if the button has been clicked for more than 100 runs, reset it.
        if(counter>100){
            setImage(images[0]);
            counter = 0;
            isClicked = false;
            changeName();
        }
        //if the user clicked this button OR the current status is clicked, enter input mode
        if(Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(getLabel()) || isClicked){
            isClicked = true;
            upgrade();
            counter++;
        }else{
            currentKey = Greenfoot.getKey(); //clears the user input
        }
    }
    /**
     * "input mode" of the button - when this method is running, the button is sensing user key input.
     */
    public void upgrade(){
        setImage(images[1]);
        currentKey = Greenfoot.getKey();
        if(currentKey == null || currentKey.equals(Attacker.getShootKey()) || currentKey.equals(BtnAmmo.getAmmoKey())){
            changeName();
        }else{
            setKey();
            isClicked = false;
            setImage(images[0]);
            counter = 0;
            changeName();
        }
    }
    public void setKey(){
    }
    public void changeName(){
    }
    public String getCurrentKey(){
        return currentKey;
    }
    public boolean getIsClicked(){
        return isClicked;
    }
}
