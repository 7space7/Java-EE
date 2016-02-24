package com.viktor.ua.dao;

import com.viktor.ua.pojo.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}
