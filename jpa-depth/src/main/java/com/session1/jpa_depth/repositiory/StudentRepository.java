package com.session1.jpa_depth.repositiory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.session1.jpa_depth.entity.Course;
import com.session1.jpa_depth.entity.Passport;
import com.session1.jpa_depth.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {
 @Autowired
 EntityManager mg;
 
 public Student findbyId(long id) {
	 return mg.find(Student.class, id);
 }
 public Student deletebyID(long id) {
	 Student ce = findbyId(id);
	 
	 mg.remove(ce);
	 return ce;
 }
 public Student add_or_Update(Student student) {
	 if(student.getId()==null) {
		 mg.persist(student);
		 
	 }
	 else {
		 mg.merge(student);
	 }
	 return student;
 }
 public void play_with_enityManager() {
	 Student c = new Student("web-service");
	 mg.persist(c);

	 c.setName("kjf");
	
	 
 }
 public void save_with_Passport() {
	 Passport p = new Passport("EJDIO9");
	 mg.persist(p);
	 Student s = new Student("hitler");
	 s.setPassport_Id(p);
	 mg.persist(s);
 }
 public void insertDatastudentCourse() {
	 Student s = new Student("kumersan");
	 Course c = new Course("web developtment");
	 mg.persist(s);
	 mg.persist(c);
	 s.addCourse_List(c);
	 c.addtStudent_List(s);
	 mg.persist(s);
	 
 }
}
