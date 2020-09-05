package circus.animal;/*
at first the circus.animal.Animal class is almost empty which is not ideal because now everything can be classed as circus.animal.Animal, i.e. a table can be casted as circus.animal.Animal
once you use Abstract keyword, you cannot create an circus.animal.Animal object

Qn: if you make circus.animal.Animal class abstract, should  you also make all the methods within abstract?
An: No, you can have an abstract class with all the normal methods implemented. By making the class abstract, you're just preventing the case where you create
instances of the class.
HOWEVER, if you make a method in a class abstract, you have to make the class abstract too!

*/


import circus.Asset;

public abstract class Animal implements Asset {

    /*
    make a method abstract by removing the method body
    Motivation:
    all objects which are of type circus.animal.Animal should be able to invoke speak(), or be given the ability to speak
    but you don't want to give a default behaviour of speak bc you're not sure if it's applicable to the animal
     */
    public abstract String speak();




    // original
/*    public String speak(){
        return null;
    }*/
}
