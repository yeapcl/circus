package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

public class Circus {

    /*
    assigning circus.animal.Duck() and circus.animal.Parrot() into an array of animals, and it works because of Substitutability where circus.animal.Duck and circus.animal.Parrot are subclasses of circus.animal.Animal!
    however the exact definition of circus.animal.Animal is pretty vague, it's just a 'concept' as of now.
    */
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    //Changed deep nesting and made happy path prominent
    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
            // some
            // more
            // code
            // here ...

        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));

        /*
        before implementing circus.Asset interface, expect error: calculateValue expects circus.stuff.Equipment class, not circus.animal.Animal class
        it works only after interface implementation of circus.Asset
         */
        System.out.println("Total value of animals " + calculateValue(animals));
    }
}
