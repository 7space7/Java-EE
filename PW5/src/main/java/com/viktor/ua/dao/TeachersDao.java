package com.viktor.ua.dao;

import com.viktor.ua.pojo.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	void saveTacher(Teacher teacher);
}
