package ru.iFellow;

public class Volvo extends Car {
    {
        super.brand = Brand.VOLVO;
    }
    public Volvo(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        super(model, year, driveType, bodyType, transmission, color);
    }
}
