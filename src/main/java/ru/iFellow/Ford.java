package ru.iFellow;

public class Ford extends Car {
    {
        super.brand = Brand.FORD;
    }
    public Ford(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        super(model, year, driveType, bodyType, transmission, color);
    }
}
