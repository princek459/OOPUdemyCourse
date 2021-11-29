public class Main {

    public static void main(String[] args) {

        Car ford = new Car();
        ford.setColor("Green");
        ford.setModel("5 wheel");
        ford.setSeats(5);
        ford.display();

//        Object creation has 2 steps

//        this is the object creation
        Car test;

//        this is the memory allocation using the 'new' keyword
        test = new Car();



    }
}
