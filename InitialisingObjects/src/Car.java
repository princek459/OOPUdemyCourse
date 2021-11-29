public class Car {

    public String model;
    public String color;
    public int seats;

    /*
        Constructors:
        Syntax
        <access-modifier> <class-name>(<parameters>){
        initialisation of members
        }
         */

//    Constructor for the class
    Car(String model, String color, int seats){
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public void display(){
        System.out.println("Model is: " + model);
        System.out.println("Color is: " + color);
        System.out.println("Seats is: " + seats);
    }

//    public void initilise(String model_t, String red, int i) {
//        model
//    }
}
