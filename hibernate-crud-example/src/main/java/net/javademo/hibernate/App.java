package net.javademo.hibernate;

import java.util.List;

import net.javademo.hibernate.dao.IStudentDao;
import net.javademo.hibernate.dao.StudentDao;
import net.javademo.hibernate.model.Student;

public class App {
	public static void main(String[] args) {
		IStudentDao studentDao = new StudentDao();
		Student student = new Student ("John","Doe","JohnDoe@gmail.com");
		studentDao.saveStudent(student);
		
		student.setFirstName("Mike");
		studentDao.updateStudent(student);
		
		Student student2 = studentDao.getStudentById(student.getId());
		
		List<Student> students = studentDao.getAllStudents();
		students.forEach(student1 -> System.out.println(student1.getId()));
		
		studentDao.deleteStudent(student.getId());
	}
}
