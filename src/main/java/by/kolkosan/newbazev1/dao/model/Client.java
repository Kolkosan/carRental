package by.kolkosan.newbazev1.dao.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class Client extends Ent implements Comparable<Client> {
    private String email;
    private String surname;
    private String name;
    private String patronymic;
    private Long telephone;
    private String address;

    @ManyToMany
    @JoinTable(name = "application",
    joinColumns = @JoinColumn(name = "id_client"),
            inverseJoinColumns = @JoinColumn(name = "id_car"))
    private List<Car> cars;

    @OneToMany(mappedBy = "client")
    private List<Application> applications;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Pasport pasport;

    @Override
    public List<Car> getCar() {
        return null;
    }

    @Override
    public int compareTo(Client o) {
        return 0;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Long getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public Pasport getPasport() {
        return pasport;
    }
}
