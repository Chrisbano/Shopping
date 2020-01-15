public class Order{
    String[] names = new String[10];
    double[] cost  = new double[10];
    int[] sku = new int[10];

    final double salesTax = 0.08;

    public Order(Item[] items){
        int index = 0;
        for (Item i:items) {
            names[index] = i.getName();
            cost[index] = i.getCents();
            sku[index] = i.getsku();
            index++;
        }
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int n = 0; n < 10; n++){
            totalCost += this.cost[n];
        }
        return (totalCost + (this.salesTax * totalCost));
    }

    public String[] getNames()
    {
        return names;
    }
    public double[] getCost()
    {
        return cost;
    }
    public int[] getSku()
    {
        return sku;
    }
}