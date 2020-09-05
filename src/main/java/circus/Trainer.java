package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();    //creating a duck object first
        getToSpeak(d);  //and trying to get this duck to speak


        /*
        the next line shows that you're taking a duck object and converting into a circus.animal.Bird type
        You're taking a subclass object and convert it into superclass
        this will work because a circus.animal.Bird is still a subclass of circus.animal.Animal (look at the para for getToSpeak() method --> known as Substitutability)
        */
        Bird b = (Bird)d;  // syntax for upcasting; however, notice IDEA says upcasting is redundant, which is true; it's downcasting which requires careful implementation
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting; notice the native type of the object is still a circus.animal.Duck!!
        getToSpeak(a);

        /*
        taking a reference of an circus.animal.Animal object and trying to convert it into another circus.animal.Duck object
        Take a superclass object and downgrade it into a child class (from circus.animal.Animal -> circus.animal.Duck)
        The motivation for downcasting is when you're working with a bunch of objects and looking for specific behaviors
        */
        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);
        train(new Duck());  //creating a new circus.animal.Duck object here and pass into train() which expects circus.animal.Bird object, but still works because circus.animal.Duck is subclass of circus.animal.Bird! (AKA substitutability)

        /*
        at first glance it seems to work because circus.animal.Parrot is a subclass of circus.animal.Bird, so should have no problem passing it into train()
        if fact it has no problem being compiled, bc it's a valid substitutability, however when you try to run this code you'll encounter
        ClassCastException error, bc at runtime you're trying to convert circus.animal.Parrot object into circus.animal.Duck object, which is unrelated
        so a workaround is to enclose the block with an instanceOf
        */
        train(new Parrot());

        /*
        before making circus.animal.Animal class abstract, the following line works;
        after making circus.animal.Animal class abstract, the following lines no longer works because it's not allowed to create circus.animal.Animal instance/object
         */
//        circus.animal.Animal a2 = new circus.animal.Animal();


//        circus.animal.Bird b2 = new circus.animal.Bird();
    }

    /*
    This all works due to polymorphism, also known as "Dynamic Binding"
    */
    private static void getToSpeak(Animal animal) {     //take in animal object as parameter
        System.out.println(animal.speak());
    }

    /*
    by the way you set up the parameter,  you're making this train() method to expect a circus.animal.Bird object
    and you want it to swim, however, swim() is only a method available to circus.animal.Duck object
    as circus.animal.Bird object only has fly()
    so what you can do is convert the circus.animal.Bird object into circus.animal.Duck object, i.e. downcasting
    */
    private static void train(Bird bird) {
        if (bird instanceof Duck) { // instanceOf is used here bc of train(new circus.animal.Parrot()), see comments above
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}