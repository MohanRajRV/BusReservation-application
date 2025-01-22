package com.session1.jpa_depth;

import org.slf4j.Logger;
import java.util.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.session1.jpa_depth.entity.Course;
import com.session1.jpa_depth.entity.FullTimeEmployee;
import com.session1.jpa_depth.entity.PartTimeEmployee;
import com.session1.jpa_depth.entity.Review;
import com.session1.jpa_depth.repositiory.DataBaseManager;
import com.session1.jpa_depth.repositiory.EmployeeRepository;
import com.session1.jpa_depth.repositiory.StudentRepository;

@SpringBootApplication

public class JpaDepthApplication implements CommandLineRunner {
	@Autowired
	DataBaseManager manger = new DataBaseManager();
	@Autowired
	StudentRepository sr = new StudentRepository();
	@Autowired
	EmployeeRepository ep= new EmployeeRepository();
	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaDepthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Course c = manger.findbyId(1000);
		logger.info("the user is ->{}",c);
		Course removed_id  = manger.deletebyID(1003);
		logger.info("the deleted user is ->{}",removed_id);
		Course add  = manger.add_or_Update(new Course("rajesh"));
		//Course update = manger.add_or_Update(new Course(1000,"kumar"));
		manger.play_with_enityManager();
		//sr.save_with_Passport();
		 */   
	
       
		//sr.insertDatastudentCourse();
		//ep.insert(new PartTimeEmployee("rajeshvari",50));
		//ep.insert(new FullTimeEmployee("abinaya",100000));
		//logger.info("the employeey table is ->{}",ep.retrive());
		
		//logger.info("the employeey table is ->{}",ep.retrivefulltime());
		
	}

}
