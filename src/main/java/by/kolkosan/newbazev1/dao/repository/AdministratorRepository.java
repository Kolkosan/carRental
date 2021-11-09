package by.kolkosan.newbazev1.dao.repository;

import by.kolkosan.newbazev1.dao.model.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends CrudRepository<Administrator,Integer> {
    // содерж операц редактир
    Administrator findAdministratorByAge(int age);
}
