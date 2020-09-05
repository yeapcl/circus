package circus;/*
an interface is a behaviour specifications, which is like a contract that any Class that is using it (keyword: implements) must abide to.

if a class say he's going to implement some interface, that means the class is adhering to the behaviour (contract) specified by this interface

 */


public interface Asset {
    int getValue(); // think of it as a contract of getValue(), which the class using this interfaces must abide to
}
