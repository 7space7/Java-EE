package com.viktor.ua.model;

import javax.persistence.*;
import java.util.Set;



@Entity
@Table(name = "Cathedra")
public class Cathedra {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer cathedraId;
    private String name;
    private Set<Lecture> lectures;

    public Integer getCathedraId() {
        return cathedraId;
    }

    public void setCathedraId(Integer cathedraId) {
        this.cathedraId = cathedraId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "Cathedra")
    public Set<Lecture> getLectures() {
        return lectures;
    }


    public void setLectures(Set<Lecture> lectures) {
        this.lectures = lectures;
    }

    @Override
    public String toString() {
        return "Cathedra{" +
                "cathedraId=" + cathedraId +
                ", name='" + name + '\'' +
                ", lectures=" + lectures +
                '}';
    }
}
