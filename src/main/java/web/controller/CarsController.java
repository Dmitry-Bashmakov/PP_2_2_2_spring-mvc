package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCarsTable(@RequestParam(value = "count", required = false) String tableSize,
                                 Model model) {
        CarServiceImpl carService = new CarServiceImpl();

        List<Car> carsList = tableSize == null?
                carService.getCars(5) :
                carService.getCars(Integer.parseInt(tableSize));

        model.addAttribute("message", "Table from " + carsList.size() + " autos");
        model.addAttribute("cars", carsList);
        return "cars_tab";
    }
}
