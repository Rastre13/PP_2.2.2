package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> listOfCars;

    public CarDaoImpl(List<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }

    @Override
    public List<Car> getListOfCars(int count) {
        if (listOfCars.size() == 0) {
            listOfCars.add(new Car("Model1", 1, "Owner1"));
            listOfCars.add(new Car("Model2", 2, "Owner2"));
            listOfCars.add(new Car("Model3", 3, "Owner3"));
            listOfCars.add(new Car("Model4", 4, "Owner4"));
            listOfCars.add(new Car("Model5", 5, "Owner5"));
        }
        if (count < 5 && count > 0) {
            return listOfCars.subList(0, count);
        }
        return listOfCars;
    }
}
