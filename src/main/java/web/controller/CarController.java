package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getSomeCars(ModelMap model, @RequestParam("count") int count) {
        List<Car> carList = Car.createCarList();
        CarService carService = new CarServiceImpl();
        model.addAttribute("carList", carService.getSomeCars(carList, count));
        return "cars";
    }
}
