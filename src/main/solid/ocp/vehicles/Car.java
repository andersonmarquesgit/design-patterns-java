package main.solid.ocp.vehicles;

//OCP usando extensão
//public class Car extends Vehicle {
//    private int seats;
//
//    public Car(String color, String year, double engine, int seats) {
//        this.color = color;
//        this.year = year;
//        this.engine = engine;
//        this.seats = seats;
//
//        configureCar();
//    }
//
//    public void configureCar() {
//        System.out.println("Criando um carro: " + color + " " + year + " " + engine + " com " + seats + " assentos");
//        startVehicle();
//    }
//}

//OCP usando interface
public class Car implements IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando carro com interfaces: " + color + " "+ engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores");
    }
}
