package Lesson12;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class L12E4 {
    public static ArrayList<car> loadFile(String filename){
        List<String> carDetails;
        ArrayList<car> allCars = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(","));
                car newCar = new car();
                newCar.make = carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Integer.parseInt(carDetails.get(4));
                newCar.colour = carDetails.get(5);
                newCar.mileage = Integer.parseInt(carDetails.get(6));
                newCar.condition = carDetails.get(7);
                allCars.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return allCars;
    }

    public static void displayCar(car thisCar){
        System.out.format("--------------------\n%s %s (%d)\nVin: %s\nColour: %s\nMileage: %d\nCondition: %s\nPrice: %d\n--------------------", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.colour, thisCar.mileage, thisCar.condition, thisCar.price);
    }
    public static void main(String[] args) {
        ArrayList<car> allCars = loadFile("C:/Users/30160735/J68V47-Classwork/src/Lesson12/carSales.txt");
        for (int i=0; i<allCars.size(); i++) {
            car thisCar = allCars.get(i);
            displayCar(thisCar);
        }
    }
}
