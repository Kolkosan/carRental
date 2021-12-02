package by.kolkosan.newbazev1.controller;

import by.kolkosan.newbazev1.dao.model.Client;
import by.kolkosan.newbazev1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SecondController {
    private  final ClientService clientService;

    @Autowired
    public SecondController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/{id}")
    public String getUser(@PathVariable("id") int id, Model model){
        final Client clientById = clientService.findClientById(id);
        model.addAttribute("client",clientById);
        return "page2";
    }
}
