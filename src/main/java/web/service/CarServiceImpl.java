package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSomeCars(List<Car> carList, int amount) {
        List<Car> someCars = new ArrayList<>();
        if (amount < carList.size()) {
            for (int i = 0; i < amount; i++) {
                someCars.add(carList.get(i));
            }
            return someCars;
        }
        return carList;
    }
}
