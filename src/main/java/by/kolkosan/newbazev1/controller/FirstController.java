package by.kolkosan.newbazev1.controller;


import by.kolkosan.newbazev1.dao.model.Application;
import by.kolkosan.newbazev1.dao.model.Car;
import by.kolkosan.newbazev1.dao.repository.AdministratorRepository;
import by.kolkosan.newbazev1.dao.repository.ApplicationRepository;
import by.kolkosan.newbazev1.dao.repository.CarRepository;
import by.kolkosan.newbazev1.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Controller
public class FirstController {
    private final AdministratorRepository administratorRepository;
    private final ClientRepository clientRepository;
    private final CarRepository carRepository;
    private final ApplicationRepository applicationRepository;

    @Autowired
    public FirstController(AdministratorRepository repository, AdministratorRepository administratorRepository, ClientRepository clientRepository, CarRepository carRepository, ApplicationRepository applicationRepository) {
        this.administratorRepository = administratorRepository;
        this.carRepository = carRepository;
        this.applicationRepository = applicationRepository;
        this.clientRepository = clientRepository;
    }


    @GetMapping("/")
    public String getFirstPage(@RequestParam("id") String numberOfRentalDays) {
        System.out.println(numberOfRentalDays);
////        Administrator administrator = repository.findAdministratorByAge(age);
////        System.out.println(administrator);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFrom = LocalDate.parse(numberOfRentalDays, formatter);

        List<Application> applicationByNumberOfRentalDays = applicationRepository.findApplicationByNumberOfRentalDays(dateFrom);
        System.out.println(Arrays.toString(applicationByNumberOfRentalDays.toArray()));
        return "page";
    }


//    @GetMapping("/")
//    public String getSecondPage(@RequestParam("id") String stamp) {
//        System.out.println(stamp);
////
//        List<Car> car = carRepository.findAllByStamp(stamp);
//        System.out.println(Arrays.toString(car.toArray()));
//        Client client = repository.findClientByTelephone(telephone);
//        System.out.println(client);
//        return "page";
//    }
}
