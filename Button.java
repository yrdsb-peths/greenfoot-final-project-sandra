import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button class - an outline for more specific buttons
 * 
 * @author Sandra Huang
 * @version June 2022
 */

public class Button extends Actor
{
    private int cost; //cost of using the button
    private String name; //button name
    private Label label; //label to display text on button
    
    /**
     * Button constructor
     * @param name  the button name
     * @param cost  the cost of using the button
     */
    public Button(String name, int cost){
        //getImage().scale(70, 50);
        this.name = name;
        this.cost = cost;
        if(cost!=0){
            label = new Label(name + "\n$" + cost, 25);
        }else{
            label = new Label(name, 25);
        }
        label.setLineColor(Label.TRANSPARENT);
    }
    /**
     * add label at the same location as the button
     */
    protected void addedToWorld(World world){
        getWorld().addObject(label, getX(), getY());
    }
    /**
     * add label at the specified x and y coordinates
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    protected void addedToWorld(World world, int x, int y){
        getWorld().addObject(label, x, y);
    }
    /**
     * checks if the player can buy the product, buys if player clicks on the button
     */
    public void act()
    {
        showText(); //show label with current value
        if((Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(label)) && canBuy()){
            buy();
        }
    }
    /**
     * updates the label value
     */
    public void showText(){
        if(cost!=0){
            label.setValue(name + "\n$" + cost);
        }else{
            label.setValue(name);
        }
    }
    /**
     * @precondition    player can buy the item
     * @postcondition   updates amount of player money, rejects more purchases if 
     *                  player does not have enough money
     */
    public void buy(){
        ((Worlds)getWorld()).updateMoney(-1*cost);
        upgrade();
        if(!Mute.muted){
            Greenfoot.playSound("clicksound.wav");
        }
    }
    /**
     * @return      whether or not the player can buy the item
     */
    public boolean canBuy(){
        return cost <= ((Worlds)getWorld()).getMoney();
    }
    /**
     * placeholder method to use in subclasses; appends whatever upgrade a button is responsible for
     */
    public void upgrade(){
        
    }
    /**
     * @return      name of button
     */
    public String getName(){
        return name;
    }
    /**
     * @param name  name for the button to be changed to
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * @return cost     returns the cost of the button
     */
    public int getCost(){
        return cost;
    }
    /**
     * updates the cost of the button
     * @param num       the cost to be updated to
     */
    public void updateCost(int num){
        cost = num;
    }
}
