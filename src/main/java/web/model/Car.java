package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String series;
    private int year;

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public static List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "M5", 2018));
        carList.add(new Car("AUDI", "A5", 2008));
        carList.add(new Car("Mercedes", "220", 2002));
        carList.add(new Car("Bentley", "Continental", 2022));
        carList.add(new Car("Skoda", "Octavia", 2024));
        return carList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
