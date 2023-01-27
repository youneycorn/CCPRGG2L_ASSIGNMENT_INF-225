public class App {
    public static void main(String[] args) throws Exception {
        
        //object i2
        Person Friend = new Person("Anton", 19);

        Myself Me = new Myself("Jaja", 18);

        Me.addFriend (Friend);

        Pet Cat = new Pet("Powder", Friend);
        Cat.showOwnerName (Friend);

        Car Jeep = new Car("Honda Civic", Me);
        Jeep.showCarOwnerName ();
    }
}
