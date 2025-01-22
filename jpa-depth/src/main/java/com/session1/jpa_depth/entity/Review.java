package com.session1.jpa_depth.entity;




import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Review {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "S_NO")
	   Integer id;
	  
	  @Column(name = "discription",length = 50)	 
	  String DESCRIPTION;
	  
	  
	  @Enumerated(EnumType.STRING)
	  @Column (name = "rating")
	   ReviewRating Rating;
	  
	  
      
      @ManyToOne
      @JoinColumn(name = "Course_Id")
	  Course course_Id;
	 

  public Course getCourse_Id() {
		return course_Id;
	}


	public void setCourse_Id(Course course_Id) {
		this.course_Id = course_Id;
	}


public Review(Integer id, String dESCRIPTION, ReviewRating rating) {
		super();
		this.id = id;
		DESCRIPTION = dESCRIPTION;
		Rating = rating;
	}
  

public Review(String dESCRIPTION,ReviewRating rating) {
	super();
	DESCRIPTION = dESCRIPTION;
	Rating = rating;
}


public Review() {
	super();
}


public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public ReviewRating getRating() {
		return Rating;
	}

	public void setRating(ReviewRating rating) {
		Rating = rating;
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", DESCRIPTION=" + DESCRIPTION + ", Rating=" + Rating + "]";
	}
	

}
  
  




 

