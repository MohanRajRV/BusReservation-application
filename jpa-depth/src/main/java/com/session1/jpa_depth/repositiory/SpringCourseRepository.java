package com.session1.jpa_depth.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.session1.jpa_depth.entity.Course;

@RepositoryRestResource(path ="courses")
public interface SpringCourseRepository extends JpaRepository<Course,Integer> {
  
	List<Course> findByName(String name);
}
