public class Weapon {

    String rarity;
    int damage;
    String Name;

    public void AddDamage(int additionalDamage){
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + damage + " to " + newDamage  );

        this.damage=newDamage;

    }

        public String showNameandRarity(){
            return this.Name + " " + this.rarity;
        }

    }


