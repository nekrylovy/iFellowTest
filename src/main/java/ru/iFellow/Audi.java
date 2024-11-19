package ru.iFellow;

public class Audi extends Car {
    {
        super.brand = Brand.AUDI;
    }
    public Audi(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        super(model, year, driveType, bodyType, transmission, color);
    }
}
