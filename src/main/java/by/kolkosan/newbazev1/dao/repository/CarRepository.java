package by.kolkosan.newbazev1.dao.repository;

import by.kolkosan.newbazev1.dao.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,String> {
     List<Car> findAllByStamp(String stamp);
}
