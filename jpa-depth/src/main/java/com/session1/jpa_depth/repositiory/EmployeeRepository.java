package com.session1.jpa_depth.repositiory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.session1.jpa_depth.entity.Employee;
import com.session1.jpa_depth.entity.FullTimeEmployee;
import com.session1.jpa_depth.entity.PartTimeEmployee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmployeeRepository {
 @Autowired
 EntityManager mg;
 
 public void insert(Employee ep) {
	 mg.persist(ep);
 }
 public List<PartTimeEmployee> retrive(){
	 return mg.createQuery("select e from PartTimeEmployee e",PartTimeEmployee.class).getResultList();
 }
 public List<FullTimeEmployee> retrivefulltime(){
	 return mg.createQuery("select e from FullTimeEmployee e",FullTimeEmployee.class).getResultList();
 }
 
}
