package by.kolkosan.newbazev1.dao.repository;


import by.kolkosan.newbazev1.dao.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
    Client findClientByTelephone(Long telephone);
}
