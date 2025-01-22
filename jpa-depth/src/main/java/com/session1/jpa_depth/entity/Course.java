package com.session1.jpa_depth.entity;




import java.util.ArrayList;

import java.util.List;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@SQLDelete(sql = "update course set  is_deleted = true where s_no= ?")

public class Course {
@Column(name = "full_Name",length = 50)
 public String name;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "S_NO")
   Integer id;
  
  boolean is_deleted;


@OneToMany(mappedBy = "course_Id")
 List<Review>review_list = new ArrayList<>();
 
 @ManyToMany(mappedBy = "Course_List")
 List<Student>student_List = new ArrayList<>();
 
 @JsonIgnore
 
 



  
  

 public List<Student> getStudent_List() {
	return student_List;
}
public void addtStudent_List(Student st) {
	student_List.add(st);
}
public List<Review> getReview() {
	return review_list;
}
public void addreview(Review review) {
	review_list.add(review);
}
public void removereview(Review review) {
	review_list.remove(review);
}

public Course() {}
 public Course(String name) {
	 this.name = name;
 }
 
   public Course(int i, String string) {
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
	return "Course [name=" + name + ", id=" + id + "]";
}




 
}
