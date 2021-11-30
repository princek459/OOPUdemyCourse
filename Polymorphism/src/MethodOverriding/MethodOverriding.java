package MethodOverriding;

    /*
    Runtime polymorphism or dynamic polymorphism

    Facts:

    If you try access parent class method using
    parent class reference holding parent class object,
    Parent class will be called

    If you try to access parent class method using child
    class references holding child object,
    Child class will be called

    If you try access parent class method using parent
    class reference holding child class object,
    child class method will be called
     */

public class MethodOverriding {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        Parent parent1 = new Child();
        parent1.m1();
    }
}
