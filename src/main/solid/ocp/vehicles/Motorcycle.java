package main.solid.ocp.vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public void configureMotorcycle() {
        System.out.println("Criando uma moto: " + year + " " + engine + " cilindradas");
        startVehicle();
    }
}
