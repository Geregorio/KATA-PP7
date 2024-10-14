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

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getSomeCars(Integer amount) {
        List<Car> carList = new ArrayList<>();
        List<Car> someCars = new ArrayList<>();
        if (carDao.getCarList().isEmpty()) {
            carList = carDao.createCarList();
        } else {
            carList = carDao.getCarList();
        }
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
