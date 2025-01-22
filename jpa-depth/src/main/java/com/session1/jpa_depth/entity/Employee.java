package com.session1.jpa_depth.entity;




import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
@MappedSuperclass

public abstract  class Employee {
@Column(name = "full_Name",length = 50)	 
 String name;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
   Integer id;
 
public Employee() {}
 public Employee(String name) {
	 this.name = name;
 }
 
   public Employee(int i, String string) {
	   id = i;
	   name = string;
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}




public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee[name=" + name + ", id=" + id + "]";
}




 
}
