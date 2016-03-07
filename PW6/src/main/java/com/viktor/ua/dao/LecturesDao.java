package com.viktor.ua.dao;


import com.viktor.ua.model.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}
