import java.util.*;

public class Shop{
    public static void main(String[] args){
        Item[] items = new Item[10];
        Scanner scan = new Scanner(System.in);

        
        items[0] = new Item("Pigeon Head Pillow"            , 14637, 10.69);
        items[1] = new Item("Pigeon Head"                   , 23463, 100.69);
        items[2] = new Item("Pigeon"                        , 32335, 0.00);
        items[3] = new Item("Head Pillow Shaped Like Pigeon", 43463, 4.20);
        items[4] = new Item("Pigeon Mug(Its A Real Pigeon)" , 53525, 5.27);
        items[5] = new Item("Pigeon Foot Massage"           , 66583, 59.99);
        items[6] = new Item("Diamond Baby Pigeon Passifier" , 72353, 10000.69);
        items[7] = new Item("Odly Shaped Pigeon"            , 83425, -5.32);
        items[8] = new Item("Vintage Pigeon Tshirt"         , 90234, 69.42);
        items[9] = new Item("Duck named Pigeon"            , 10723, 500.99);

        System.out.println("adjaldjsaldjasl dhadad andsad nsla daldhKdhAKSJd");

        // System.out.println("Welcome to the powne zone...prepare to get powned");
        // System.out.println("Here are all the items we sell. ");
        // int n = 0;
        // for(Item i:items) {
            
        //     System.out.println(n + ". " +  i.getName() + " " + i.getDollars() + "$");
        //     n++;
        // }
        
        // boolean doneShoping = false;
        // Item[] cart = new Item[10];
        // int i = 0;
        // while(!doneShoping) {
        //     System.out.println("Add Items, 0 too Finish)");
        //     int choice = scan.nextInt();

        //     if(choice > 10 || i > 10) {
        //         doneShoping = true;
        //     }else {
        //         cart[i] = items[choice];
        //         i++;
        //     }
        // }
        Order orderOne = new Order(items);

        for (Item i:items)
        {
            String listofnames = orderOne.getNames();

        }





        //displayOrder();


        


        

    }
} 