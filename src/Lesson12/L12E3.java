package Lesson12;

public class L12E3 {
    public static void displayCar(car thisCar){
        System.out.format("--------------------\n%s %s (%d)\nVin: %s\nColour: %s\nMileage: %d\nCondition: %s\nPrice: %d\n--------------------", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.colour, thisCar.mileage, thisCar.condition, thisCar.price);
    }

    public static void main(String[] args) {
        car car1 = new car();
        car1.make = "Honda";
        car1.model = "Civic";
        car1.year = 2003;
        car1.vin = "AWGA8DJAK8DX9A";
        car1.price = 1738;
        car1.colour = "black";
        car1.mileage = 958473;
        car1.condition = "fair";
        displayCar(car1);
    }
}
