package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getSomeCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("carList", carService.getSomeCars(new CarDaoImpl().createCarList(), count));
        return "cars";
    }
}
