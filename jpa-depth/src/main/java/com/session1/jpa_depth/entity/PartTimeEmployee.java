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
public class PartTimeEmployee extends Employee{
	int bavrage;
	PartTimeEmployee(){
	}
	public PartTimeEmployee(String name,int baverage){
     super(name);
     bavrage = baverage;
	}
	
	 
}
