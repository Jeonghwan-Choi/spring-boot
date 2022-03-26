package com.spring.basic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "basic_info")
public class BasicDto {
    
    private Long id;
    private String date;
    private String name;
    private String customer;
    private String sqm;
    private String number;
    private String people;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "date", nullable = false)
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "customer", nullable = false)
    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Column(name = "sqm", nullable = false)
    public String getSqm() {
        return this.sqm;
    }

    public void setSqm(String sqm) {
        this.sqm = sqm;
    }

    @Column(name = "number", nullable = false)
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "people", nullable = false)
    public String getPeople() {
        return this.people;
    }

    public void setPeople(String people) {
        this.people = people;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", date='" + getDate() + "'" +
            ", name='" + getName() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", sqm='" + getSqm() + "'" +
            ", number='" + getNumber() + "'" +
            ", people='" + getPeople() + "'" +
            "}";
    }


}
