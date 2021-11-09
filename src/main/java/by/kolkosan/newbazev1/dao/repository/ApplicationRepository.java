package by.kolkosan.newbazev1.dao.repository;

import by.kolkosan.newbazev1.dao.model.Application;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Date> {
    List<Application> findApplicationByNumberOfRentalDays(LocalDate numberOfRentalDays);
}


