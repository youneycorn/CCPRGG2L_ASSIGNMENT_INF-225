public class App {
    public static void main(String[] args) throws Exception {

        // Polymorphic variable/object

       
        GroceryItem item1 = new GroceryItem();
        item1.name = "Tissue";
        item1.showItemName();
       
         // item in form of a toothbrush
        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.showItemName();
        item2.price = 123.54;

        // item in form of a toothpaste
        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.showItemName();
        item3.price = 135.47;
        
        // Cashier Object
        Cashier c1 = new Cashier();

        c1.checkOut(item2);
        c1.checkOut(item3);
        c1.showPrice(item2);
        c1.showPrice(item3);


          // Polymorphic array
          GroceryItem[] itemArray = new GroceryItem[2];
          itemArray[0] = item2;
          itemArray[1] = item3;


        // Loop through all items 
        for (int i = 0; i < 2; i++) {
            itemArray[i].showItemName();
        }
        
        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();

    }
}
