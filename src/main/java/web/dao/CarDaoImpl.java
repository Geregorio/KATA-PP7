package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {


    private final List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> createCarList() {
        carList.add(new Car("BMW", "M5", 2018));
        carList.add(new Car("AUDI", "A5", 2008));
        carList.add(new Car("Mercedes", "220", 2002));
        carList.add(new Car("Bentley", "Continental", 2022));
        carList.add(new Car("Skoda", "Octavia", 2024));
        return carList;
    }

    @Override
    public void clearCarList() {
        carList.clear();
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}
