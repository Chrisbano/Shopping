public class Item{
    private String name;
    private int sku;
    private double cost;

    public Item(String name, int sku, double cost){
        this.name = name;
        this.sku  = sku;
        this.cost = cost;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void changeCost(double cost){
        this.cost = cost;
    }

    public void changesku(int sku){
        this.sku = sku;
    }

    public String getName(){
        return this.name;
    }

    public double getDollars(){
        return this.cost;
    }

    public double getCents(){
        return(this.cost * 100);
    }

    public int getsku(){
        return this.sku;
    }
}