package com.viktor.ua.model;

import com.viktor.ua.dao.AddressEmbeddables;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String city;
    private String street;
    @Embedded
    private AddressEmbeddables add;
    @Transient
    private String houseNumber;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Lecture lecture;

    // Getters and settings
    public int getId() {
        return id;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", city=" + city + ", street=" + street
                + "]";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public AddressEmbeddables getAdd() {
        return add;
    }

    public void setAdd(AddressEmbeddables add) {
        this.add = add;
    }
}
