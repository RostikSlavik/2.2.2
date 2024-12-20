package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota Corolla", 15000, 2018),
            new Car("BMW X5", 50000, 2020),
            new Car("Audi A3", 10000, 2012),
            new Car("Renault Duster", 17500, 2021),
            new Car("Ford Mustang", 60000, 2019)
    );

    @Override
    public List<Car> getSomeCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
