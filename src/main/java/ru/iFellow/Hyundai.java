package ru.iFellow;

public class Hyundai extends Car {
    {
        super.brand = Brand.HYUNDAI;
    }
    public Hyundai(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        super(model, year, driveType, bodyType, transmission, color);
    }
}
