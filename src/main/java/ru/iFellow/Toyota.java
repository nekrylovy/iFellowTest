package ru.iFellow;

public class Toyota extends Car{
    {
        super.brand = Brand.TOYOTA;
    }
    public Toyota(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        super(model, year, driveType, bodyType, transmission, color);
    }
}
