package circus.animal;/*
circus.animal.Bird object is also pretty much a concept
to prevent creating a circus.animal.Bird object
 */

public abstract class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }
}
