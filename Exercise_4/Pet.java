public class Pet {
    String name;
    Person owner; 
    
    Pet(String petName, Person ownerName){
        this.name = petName;
        this.owner = ownerName;
    }
        void showOwnerName(Person friend){
            System.out.println("My name is " + this.name + ". My owner name is " + friend.name);
    }

}
