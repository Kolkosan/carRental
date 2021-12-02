package by.kolkosan.newbazev1.dao.repository;


import by.kolkosan.newbazev1.dao.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Client findClientById(int id);
    List<Client> findAllClient();
}
