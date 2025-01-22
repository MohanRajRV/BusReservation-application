package com.session1.jpa_depth.entity;






import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

public class Passport {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "S_NO")
   Integer id;
  
  
  @Column(name = "Passport_Number",length = 50)	 
   String Number;
  
  @OneToOne(fetch=FetchType.LAZY,mappedBy = "Passport_Id")
  Student Student_ID;

 
public Student getStudent_ID() {
	return Student_ID;
}


public void setStudent_ID(Student student_ID) {
	Student_ID = student_ID;
}


public Passport() {}


 public Passport(String name) {
	 this.Number = name;
 }
 
   public Passport(int i, String string) {
	   id = i;
	   Number = string;
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}




public String getName() {
	return Number;
}


public void setName(String name) {
	this.Number = name;
}


@Override
public String toString() {
	return "Passport [id=" + id + ", Number=" + Number + "]";
}




 
}
