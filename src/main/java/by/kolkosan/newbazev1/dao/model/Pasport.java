package by.kolkosan.newbazev1.dao.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pasport extends Ent{

    private String serial_number;
    private String citizeship;
    private Date dateIssue;
    private String issuedByWhom;

    @OneToOne
    @JoinColumn(name = "id",referencedColumnName = "id")
    private Client client;

    @Override
    public List<Car> getCar() {
        return null;
    }
}
