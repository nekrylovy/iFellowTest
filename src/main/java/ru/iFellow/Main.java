package ru.iFellow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>(10);
        cars.add(new Toyota("Trueno", 1987, DriveType.RWD, BodyType.HATCHBACK, Transmission.MT, Color.WHITE));
        cars.add(new Toyota("Celica", 1999, DriveType.FWD, BodyType.COUPE, Transmission.MT, Color.BLACK));
        cars.add(new Audi("RS6", 2014, DriveType.AWD, BodyType.WAGON, Transmission.AT, Color.GRAY));
        cars.add(new Audi("A8", 2020, DriveType.AWD, BodyType.SEDAN, Transmission.AT, Color.BLUE));
        cars.add(new Hyundai("Accent", 2006, DriveType.FWD, BodyType.SEDAN, Transmission.MT, Color.GRAY));
        cars.add(new Hyundai("i30", 2017, DriveType.FWD, BodyType.HATCHBACK, Transmission.AT, Color.GREEN));
        cars.add(new Ford("GT40", 1964, DriveType.RWD, BodyType.COUPE, Transmission.MT, Color.BLUE));
        cars.add(new Ford("Mustang", 2018, DriveType.RWD, BodyType.COUPE, Transmission.AT, Color.RED));
        cars.add(new Volvo("S80", 2014, DriveType.FWD, BodyType.SEDAN, Transmission.MT, Color.BLACK));
        cars.add(new Volvo("V60", 2024, DriveType.AWD, BodyType.WAGON, Transmission.AT, Color.GREEN));

        printModernCars(cars);
        repaintGreenCars(cars);
//        printAllCars(cars);
        printCarsByCountry(cars);
    }

    static void printAllCars(List<Car> list) {
        for (Car i : list) {
            i.printInfo();
        }
    }

    static void printModernCars(List<Car> list) {
        for (Car i : list) {
            if (i.getYear() > 2006) {
                i.printInfo();
            } else {
                System.out.println("устаревший авто\n");
            }
        }
    }

    static void repaintGreenCars(List<Car> list) {
        for (Car i : list) {
            if (i.getColor() == Color.GREEN) {
                i.changeColor(Color.RED);
            }
        }
    }

    static void printCarsByCountry(List<Car> list) {
        for (Car i : list) {
            switch (i.getBrand().ordinal()) {
                case 0:
                    System.out.println("Япония:");
                    break;
                case 1:
                    System.out.println("Германия:");
                    break;
                case 2:
                    System.out.println("Южная корея:");
                    break;
                case 3:
                    System.out.println("США:");
                    break;
                case 4:
                    System.out.println("Швеция:");
                    break;
                default:
                    System.out.println("Неизвестно:");
            }
            i.printInfo();
        }
    }
}