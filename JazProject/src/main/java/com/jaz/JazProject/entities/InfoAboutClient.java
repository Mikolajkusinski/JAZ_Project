package com.jaz.JazProject.entities;

import com.jaz.JazProject.enumes.TypeOfBuldingEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class InfoAboutClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;
    private String Surname;
    private String Adress;
    private Long waterUsage;
    private double yardage;
    private int howManyPeople;
    private TypeOfBuldingEnum type;
    private boolean recycling;
    private double finalPrice;


    public InfoAboutClient() {
    }

    public InfoAboutClient(String name, String surname, String adress, Long waterUsage, double yardage, int howManyPeople, TypeOfBuldingEnum type, boolean recycling) {
        Name = name;
        Surname = surname;
        Adress = adress;
        this.waterUsage = waterUsage;
        this.yardage = yardage;
        this.howManyPeople = howManyPeople;
        this.type = type;
        this.recycling = recycling;
    }

    public InfoAboutClient(Long id, String name, String surname, String adress, Long waterUsage, double yardage, int howManyPeople, TypeOfBuldingEnum type, boolean recycling) {
        this.id = id;
        Name = name;
        Surname = surname;
        Adress = adress;
        this.waterUsage = waterUsage;
        this.yardage = yardage;
        this.howManyPeople = howManyPeople;
        this.type = type;
        this.recycling = recycling;
    }

    public InfoAboutClient(String name, String surname, String adress, Long waterUsage, double yardage, int howManyPeople, TypeOfBuldingEnum type, boolean recycling, double finalPrice) {
        Name = name;
        Surname = surname;
        Adress = adress;
        this.waterUsage = waterUsage;
        this.yardage = yardage;
        this.howManyPeople = howManyPeople;
        this.type = type;
        this.recycling = recycling;
        this.finalPrice = finalPrice;
    }
}
