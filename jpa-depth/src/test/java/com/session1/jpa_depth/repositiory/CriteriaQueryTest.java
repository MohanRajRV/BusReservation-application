package com.session1.jpa_depth.repositiory;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.session1.jpa_depth.JpaDepthApplication;
import com.session1.jpa_depth.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
@SpringBootTest(classes = JpaDepthApplication.class)
public class CriteriaQueryTest {
	Logger lg = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager mg;
	
	/*@Test
	@Transactional
	public void Crteria_Test() {
		
	CriteriaBuilder cb = mg.getCriteriaBuilder();
	CriteriaQuery<Course>cq = cb.createQuery(Course.class);
	Root<Course>root = cq.from(Course.class);
	TypedQuery<Course>tq = mg.createQuery(cq.select(root));
    List<Course>list = tq.getResultList();
    lg.info("the course ->{}",list);
    
    
	}*/
@Test
@Transactional
	public void Crteria_Test_Courselike100() {
 CriteriaBuilder cb = mg.getCriteriaBuilder();
 CriteriaQuery<Course>cq = cb.createQuery(Course.class);
 Root<Course>root = cq.from(Course.class);
  Predicate q = cb.like(root.get("name"),"%WEB%");
  cq.where(q);
  TypedQuery<Course>tq = mg.createQuery(cq.select(root));
  List<Course>list = tq.getResultList();
  lg.info("the course name like 100  ->{}",list);
  
    
	}
}
