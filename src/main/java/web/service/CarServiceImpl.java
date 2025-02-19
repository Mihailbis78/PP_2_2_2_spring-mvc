package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Lexus", "is250",2008));
        cars.add(new Car("Mercedes", "E300",2013));
        cars.add(new Car("Mitsubishi", "Lancer",2006));
        cars.add(new Car("Audi", "A4",2002));
        cars.add(new Car("Toyota", "Camry",2007));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
