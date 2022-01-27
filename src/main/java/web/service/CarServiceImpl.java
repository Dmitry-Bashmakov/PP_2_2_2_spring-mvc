package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int quantity) {
        List<Car> autos = new ArrayList<>();
        autos.add(new Car("BMW", "X3", "1"));
        autos.add(new Car("BMW", "X5", "2"));
        autos.add(new Car("BMW", "X7", "3"));
        autos.add(new Car("Audi", "Q8", "4"));
        autos.add(new Car("WV", "Passat", "9"));

        List<Car> carsList = new ArrayList<>();
        Iterator<Car> autosIterator = autos.listIterator();

        int autoCount = (quantity >= 5) || (quantity < 0) ? 5 : quantity;

        for (int i = 0; i < autoCount; i++) {
            carsList.add(autosIterator.next());
        }
        return carsList;
    }
}
