package by.kolkosan.newbazev1.dao.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class Client extends Ent {
    private String surname;
    private String name;
    private String patronymic;
    private Long telephone;
    private String address;

    @OneToMany(mappedBy = "client")
    private List<Application> applications;

    @OneToOne(mappedBy = "client")
    private Pasport pasport;

}
