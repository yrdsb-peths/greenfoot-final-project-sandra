import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private int cost;
    private String name;
    private boolean canBuy;
    
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
    public void act()
    {
        if(cost <= ((Worlds)getWorld()).getMoney()){
            canBuy = true;
        }
        if(Greenfoot.mouseClicked(this) && canBuy){
            buy();
        }
    }
    public void showText(){
        if(cost!=0){
            getWorld().showText(name + "\n$" + cost, getX(), getY());
        }else{
            getWorld().showText(name, getX(), getY());
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
