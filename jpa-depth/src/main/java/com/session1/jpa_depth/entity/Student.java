package com.session1.jpa_depth.entity;




import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "S_NO")
   Integer id;
  
  
  @Column(name = "full_Name",length = 50)	 
  String name;
  
  @Embedded
  Adress ad;
 public Adress getAd() {
	return ad;
}
 public void setAd(Adress ad) {
		this.ad = ad;
	}
  

  @OneToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "Passport_Id")
  private Passport Passport_Id;
  
  @ManyToMany
  @JoinTable(name = "student_courses",joinColumns = @JoinColumn(name = "Student_Id")
  ,inverseJoinColumns = @JoinColumn(name = "Course_ID"))
  List<Course>Course_List = new ArrayList<>();
  



 public List<Course> getCourse_List() {
	return Course_List;
}


public void addCourse_List(Course course) {
	Course_List.add(course);
}


public Student(String name, Passport passport_Id) {
	super();
	this.name = name;
	this.Passport_Id = passport_Id;
}


public Student(Integer id, String name, Passport passport_Id) {
	super();
	this.id = id;
	this.name = name;
	Passport_Id = passport_Id;
}


public Passport getPassport_Id() {
	return Passport_Id;
}


public void setPassport_Id(Passport passport_Id) {
	Passport_Id = passport_Id;
}


public Student() {}
 
 
 public Student(String name) {
	 this.name = name;
 }
 
   public Student(int i, String string) {
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
	return "Student [id=" + id + ", name=" + name + "]";
}




 
}
