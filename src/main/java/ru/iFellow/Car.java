package ru.iFellow;

import lombok.Getter;

public abstract class Car {
    @Getter
    protected Brand brand;
    protected String model;
    @Getter
    protected int year;
    protected DriveType driveType;
    protected BodyType bodyType;
    protected Transmission transmission;
    @Getter
    protected Color color;

    Car(String model, int year, DriveType driveType, BodyType bodyType, Transmission transmission, Color color) {
        this.model = model;
        this.year = year;
        this.driveType = driveType;
        this.bodyType = bodyType;
        this.transmission = transmission;
        this.color = color;
    }

    public void printInfo() {
        System.out.printf("%s %s (%d) %s %s\n%s привод. %s КПП\n\n",
                brand.getTitle(), model, year, color.getTitle(), bodyType.getTitle(),
                driveType.getTitle(), transmission.getTitle());
    }

    public void changeColor(Color color) {
        this.color = color;
    }
}

@Getter
enum Brand {
    TOYOTA("Toyota"),
    AUDI("Audi"),
    HYUNDAI("Hyundai"),
    FORD("Ford"),
    VOLVO("Volvo");
    private final String title;
    Brand(String title) {
        this.title = title;
    }
}

@Getter
enum DriveType {
    FWD("Передний"),
    RWD("Задний"),
    AWD("Полный");
    private final String title;
    DriveType(String title) {
        this.title = title;
    }
}

@Getter
enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    WAGON("Универсал");
    private final String title;
    BodyType(String title) {
        this.title = title;
    }
}

@Getter
enum Transmission {
    MT("Механическая"),
    AT("Автоматическая");
    private final String title;
    Transmission(String title) {
        this.title = title;
    }
}

@Getter
enum Color {
    WHITE("Белый"),
    GRAY("Серый"),
    BLACK("Черный"),
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий");
    private final String title;
    Color(String title) {
        this.title = title;
    }
}