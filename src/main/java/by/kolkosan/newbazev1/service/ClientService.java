package by.kolkosan.newbazev1.service;

import by.kolkosan.newbazev1.dao.model.Car;
import by.kolkosan.newbazev1.dao.model.Client;

import java.util.List;

public interface ClientService {
    Client findClientById(int id);
    List<Car> findClientCar(int id);
    List<Client> findAll();
}
