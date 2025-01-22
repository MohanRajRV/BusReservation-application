package com.session1.jpa_depth.entity;




import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class FullTimeEmployee extends Employee{
	
	int Salary;
	FullTimeEmployee(){
	}
	public FullTimeEmployee(String name,int baverage){
     super(name);
     Salary = baverage;
	}
	
	 
}
