package by.kolkosan.newbazev1.service;

import by.kolkosan.newbazev1.dao.model.Car;
import by.kolkosan.newbazev1.dao.model.Client;
import by.kolkosan.newbazev1.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServicelmpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServicelmpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClientById(int id) {
        return (Client) clientRepository.findAllClient();
    }

    @Override
    public List<Car> findClientCar(int id) {
        return clientRepository.findClientById(id).getCar();
    }
    @Override
    public List<Client> findAll() {
        return clientRepository.findAllClient();
    }

}
