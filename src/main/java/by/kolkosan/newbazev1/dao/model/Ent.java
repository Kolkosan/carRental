package by.kolkosan.newbazev1.dao.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass // класс исп как сущн от которор наслед  (абстр)
public abstract class Ent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // меньше писанины
    private int id;

}
