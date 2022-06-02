import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private int cost;
    private String name;
    private boolean canBuy;
    private Label label;
    
    public Button(String name, int cost){
        getImage().scale(70, 50);
        this.name = name;
        this.cost = cost;
    }
    public Button(String name, int cost, int sizex, int sizey){
        getImage().scale(sizex, sizey);
        this.name = name;
        this.cost = cost;
    }
    protected void addedToWorld(){
        if(cost!=0){
            label = new Label(name + "\n$" + cost, 25);
            getWorld().addObject(label, getX(), getY());
        }else{
            label = new Label(name + "\n$" + cost, 25);
            getWorld().addObject(label, getX(), getY());
        }
    }
    protected void addedToWorld(int x, int y){
        if(cost!=0){
            label = new Label(name + "\n$" + cost, 25);
            getWorld().addObject(label, x, y);
        }else{
            label = new Label(name + "\n$" + cost, 25);
            getWorld().addObject(label, x, y);
        }
    }
    public void act()
    {
        showText();
        if(cost <= ((Worlds)getWorld()).getMoney()){
            canBuy = true;
        }
        if(Greenfoot.mouseClicked(this) && canBuy){
            buy();
        }
    }
    public void showText(){
        if(cost!=0){
            label.setValue(name + "\n$" + cost);
        }else{
            label.setValue(name);
        }
    }
    public void buy(){
        ((Worlds)getWorld()).updateMoney(0-cost);
        if(cost>((Worlds)getWorld()).getMoney()){
            canBuy = false;
        }
    }
    public boolean getBuyStatus(){
        return canBuy;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public void updateCost(int num){
        cost = num;
    }
}
