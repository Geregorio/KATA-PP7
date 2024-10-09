package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    protected CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getSomeCars(List<Car> carList, Integer amount) {
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

    public List<Car> getCarList() {
        return carDao.createCarList();
    }
}
