public class Car {
    private String type;
    private int noSeats;
    private String fuel;
    private String bodyColor;

    public Car() {
        type = "";
        noSeats = 0;
        fuel = "";
        bodyColor = "";
    }

    public Car(String type, int noSeats, String fuel, String bodyColor) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuel = fuel;
        this.bodyColor = bodyColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Your favorite car", 4, "Gasoline", "Red");
        Car car2 = new Car();

        System.out.println("Car 1 Type: " + car1.getType());
        System.out.println("Car 1 Seats: " + car1.getNoSeats());
        System.out.println("Car 1 Fuel: " + car1.getFuel());
        System.out.println("Car 1 Body Color: " + car1.getBodyColor());

        car2.setType("Another Car");
        car2.setNoSeats(5);
        car2.setFuel("Electric");
        car2.setBodyColor("Blue");

        System.out.println("Car 2 Type: " + car2.getType());
        System.out.println("Car 2 Seats: " + car2.getNoSeats());
        System.out.println("Car 2 Fuel: " + car2.getFuel());
        System.out.println("Car 2 Body Color: " + car2.getBodyColor());

        compareSeats(car1, car2);
    }

    public static void compareSeats(Car car1, Car car2) {
        int seats1 = car1.getNoSeats();
        int seats2 = car2.getNoSeats();

        if (seats1 > seats2) {
            System.out.println("Car 1 has more passenger seats.");
        } else if (seats1 < seats2) {
            System.out.println("Car 2 has more passenger seats.");
        } else {
            System.out.println("Both cars have the same number of passenger seats.");
        }
    }
}
