public class Main {

    public static void main(String[] args) {
        Car a = new Car();
        a.display();
        System.out.println(a.seats);

        Ford ford = new Ford();
        ford.displayFord();
        ford.display();
        System.out.println(ford.seats);

        Car abc = new Ford();
        System.out.println("ABC: " + abc.seats);
        abc.display();

    }
}
