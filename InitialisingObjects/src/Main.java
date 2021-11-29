public class Main {

    public static void main(String[] args) {
        /*
        There are 3 ways to initialise instance variables
        1. At the time of the declaration
        2. Method
        3. From main class using reference variables
        */
//        Car c = new Car();
//        Car c1 = new Car();
//        c.display();
//        c1.display();
//        c.initilise("model t", "Red", 4);



//        Invoking an instructor
        Car c = new Car("Ford", "Blue", 4);
        c.display();
    }
}
