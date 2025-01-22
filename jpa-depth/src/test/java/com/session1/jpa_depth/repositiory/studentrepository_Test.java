package com.session1.jpa_depth.repositiory;

import static org.junit.jupiter.api.Assertions.assertEquals
;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test
;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.session1.jpa_depth.JpaDepthApplication;
import com.session1.jpa_depth.entity.Adress;
import com.session1.jpa_depth.entity.Course;
import com.session1.jpa_depth.entity.Passport;
import com.session1.jpa_depth.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@SpringBootTest(classes = JpaDepthApplication.class)
class studentrepository_Test {
	Logger lg = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager mg;

   /*@Test
   @Transactional
	 public void retriveStudentAndCOurse( ) {
		 Course s = mg.find(Course.class,1000);
		 lg.info("the course ->{}",s);
		 lg.info("teh student ->{}",s.getStudent_List());
		 
	 }*/

   @Test
   @Transactional
	 public void Nplusoneproblem() {
		 List<Course>x = mg.createQuery("select c from Course c JOIN FETCH c.student_List",Course.class).getResultList();
		 	 for(Course c:x) {
		 	   lg.info("the courses ->{} the studnet is ->{}",c,c.getStudent_List());
		 		 
		 	 }	
	
	
	
   }
}
