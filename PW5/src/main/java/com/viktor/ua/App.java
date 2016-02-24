package com.viktor.ua;

import com.viktor.ua.pojo.Student;
import com.viktor.ua.pojo.Teacher;
import com.viktor.ua.service.WorkWithStudents;
import com.viktor.ua.service.WorkWithTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring_config.xml");
		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		// new WorkWithStudents();
		Student testStudent = new Student("Vlad Valt", 1);
		worker.saveStudentToDb(testStudent);
		WorkWithTeacher workWithTeacher = (WorkWithTeacher) context
				.getBean("teachersWorker");
		Teacher teacher = new Teacher();
		teacher.setFirstname("Andrii");
		teacher.setLastname("Glybovets");
		teacher.setCellphone("+380675097865");
		teacher = workWithTeacher.addTeacher(teacher);
		teacher.setBirthDate(new Date());
		workWithTeacher.saveTacher(teacher);

	}
}
