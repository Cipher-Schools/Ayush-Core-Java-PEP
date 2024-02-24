package net.javademo.hibernate.dao;

import java.util.List;

import net.javademo.hibernate.model.Student;

public interface IStudentDao {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(Long id);

	List<Student> getAllStudents();

	void deleteStudent(Long id);

}