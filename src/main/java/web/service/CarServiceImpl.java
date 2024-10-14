package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.controller.CarController;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getSomeCars(Integer amount) {
        carDao.clearCarList();
        List<Car> carList = carDao.createCarList();
        List<Car> someCars = new ArrayList<>();
        if (amount == null) {
            return carList;
        } else if (amount < carList.size()) {
            for (int i = 0; i < amount; i++) {
                someCars.add(carList.get(i));
            }
            return someCars;
        }
        return carList;
    }
}
