package by.kolkosan.newbazev1.dao.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity     // класс сущн  и сбд
@Table(name = "administrator")  // точное название
public class Administrator extends Ent{
    //@Column(name = "id_administrator")
    //private int id_Administrator;
    private String surname;
    private String name;
    private int age;


    @OneToMany(mappedBy = "administrator")
    private List<Application> application;
}
