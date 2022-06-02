package main.solid.ocp;

import main.solid.ocp.vehicles.Car;
import main.solid.ocp.vehicles.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

        //FORMA ERRADA QUE QUEBRA O PRINCÍPIO DA SINGULARIDADE
//        if(typeVehicle == TypeVehicle.CAR) {
//            Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
//            vehicle.car();
//        }else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
//            Vehicle vehicle = new Vehicle("", "2022", 250, 1);
//            vehicle.motorCycle();
//        }

        if(typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Amarelo", "2021", 2.0, 4);
        }else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("", "2022", 250);
        }
    }
}
