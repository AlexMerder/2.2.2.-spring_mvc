package web.controller;


import com.google.common.io.LimitInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Cars {

    @GetMapping(value = "/cars")
    public String countCars(@RequestParam(value = "count", required = false) int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmv", 170, 150));
        cars.add(new Car("oka", 25, 22));
        cars.add(new Car("mercedes", 270, 350));
        cars.add(new Car("porshe", 190, 333));
        cars.add(new Car("lada", 110, 30));

//        List<Car> result;
//        result = new ArrayList<>(cars.subList(0, count));
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (count >= 5) {
                result.addAll(cars.subList(0, cars.size()));
                break;
            } else
                result.add(cars.get(i));
        }
        model.addAttribute("count", result);
        return "cars";
    }

}
