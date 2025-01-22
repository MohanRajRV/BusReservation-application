package com.session1.jpa_depth.repositiory;

import org.slf4j.Logger;
import java.util.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.session1.jpa_depth.entity.Course;
import com.session1.jpa_depth.entity.Review;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DataBaseManager {
	Logger lg = LoggerFactory.getLogger(this.getClass());
 @Autowired
 EntityManager mg;
 
 public Course findbyId(long id) {
	 return mg.find(Course.class, id);
 }
 public Course deletebyID(long id) {
	 Course ce = findbyId(id);
	 
	 mg.remove(ce);
	 return ce;
 }
 public Course add_or_Update(Course course) {
	 if(course.getId()==null) {
		 mg.persist(course);
		 
	 }
	 else {
		 mg.merge(course);
	 }
	 return course;
 }
 public void play_with_enityManager() {
	 Course c = new Course("web-service");
	 mg.persist(c);

	 c.setName("kjf");
	
	 
 }
 public void addCoureseReviewHard(int id) {
	 Course course = mg.find(Course.class,id);
	 lg.info("the revie is ->{}",course.getReview());
	 Review r1 = new Review("super courese","5");
	 r1.setCourse_Id(course);
	 Review r2 = new Review("WORST COURSE","1");
	 r2.setCourse_Id(course);
	 course.addreview(r2);
	 course.addreview(r1);
	 mg.persist(r2);
	 mg.persist(r1);
	 
	 
 }
 public void addCoureseReview(int id,List<Review>R) {
	 Course course = mg.find(Course.class,id);
	 lg.info("the revie is ->{}",course.getReview());
	  
	 for(Review x : R) {
        x.setCourse_Id(course);
        course.addreview(x);
        mg.persist(x);

	 
	 }
 }
}
