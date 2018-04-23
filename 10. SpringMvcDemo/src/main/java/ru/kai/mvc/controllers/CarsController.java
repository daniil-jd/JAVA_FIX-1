package ru.kai.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.kai.mvc.models.Car;
import ru.kai.mvc.repositories.CarsRepository;
import ru.kai.mvc.repositories.UsersRepository;

import java.util.List;

/**
 * 23.04.2018
 * CarsController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class CarsController {
    @Autowired
    private CarsRepository carsRepository;

    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    @ResponseBody
    public String getCarsByOwnerFirstNameContains(@RequestParam("name") String name) {
        List<Car> cars = carsRepository.findAllByOwner_FirstName(name);
        return cars.toString();
    }
}
