public class Car {
    String car;
    Myself owner; 

    Car(String carName, Myself ownerName){
        this.car = carName;
        this.owner = ownerName;
    }
        void showCarOwnerName (){
            System.out.println("The car name is " + this.car + ". The owner name is " + owner.name);
    }

}