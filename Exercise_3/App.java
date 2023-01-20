public class App {

    public static void main(String[] args) {



        Character knight = new Character();



        knight.strength = 10;

        knight.agility = 5;

        knight.intelligence = 0;

        knight.name = "Chen";



        knight.sayMyName();

        knight.sayMyStrength();

        knight.sayMyAgility();

        knight.sayMyIntelligence();



        System.out.println();



        Character mage = new Character();



        mage.strength = 0;

        mage.agility = 5;

        mage.intelligence = 10;

        mage.name = "Akasha";





        mage.sayMyName();

        mage.sayMyStrength();

        mage.sayMyAgility();

        mage.sayMyIntelligence();

   

        System.out.println();




        Character thief = new Character();



        thief.strength = 5;

        thief.agility = 10;

        thief.intelligence = 0;

        thief.name = "Gondar";




        thief.sayMyName();

        thief.sayMyStrength();

        thief.sayMyAgility();

        thief.sayMyIntelligence();



        System.out.println();



        Character traveller = new Character();



            traveller.name = "Lumine";

            traveller.Attack();



            System.out.println();



        Weapon sword = new Weapon();



        sword.Name = "Knight's Sword";
        sword.damage = 20;
        sword.rarity = "5 STAR";
        sword.AddDamage(6);


        System.out.print(sword.showNameandRarity());
        Character Archer = new Character ();

        Archer.name = "Knight";
        Archer.Attack();

       
    }

}
