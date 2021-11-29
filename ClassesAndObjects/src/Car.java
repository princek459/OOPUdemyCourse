public class Car {

    public String model;
    public String color;
    public int seats;

    public Car() {
    }

    public void display(){
        System.out.println("Model is: " + model);
        System.out.println("Color is: " + color);
        System.out.println("Seats are: " + seats);
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
