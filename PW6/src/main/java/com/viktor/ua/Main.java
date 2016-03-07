package com.viktor.ua;

import com.viktor.ua.dao.AddressEmbeddables;
import com.viktor.ua.model.Address;
import com.viktor.ua.model.Cathedra;
import com.viktor.ua.model.Lecture;
import com.viktor.ua.service.LecturesWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);

        Set<Lecture> lectureSet=new HashSet();;
        lectureSet.add(lecture);

        Cathedra cathedra=new Cathedra();
        cathedra.setName("FI");
        cathedra.setLectures(lectureSet);

        Address address = new Address();
        address.setCity("Kyiv");
        address.setStreet("Skovoroda street");
        AddressEmbeddables add = new AddressEmbeddables();
        add.setState("state");
        add.setCountry("country");
        add.setZipcode("zipcode");
        // test embeddable object
        address.setAdd(add);

        // test one to one bidirectional
        lecture.setAddress(address);
        address.setLecture(lecture);
        lecture.setCathedra(cathedra);
        LecturesWorker worker = (LecturesWorker) context.getBean("worker");
        worker.addLecture(lecture);



    }
}

