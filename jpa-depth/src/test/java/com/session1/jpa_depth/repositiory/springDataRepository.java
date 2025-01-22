package com.session1.jpa_depth.repositiory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.Test
;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.session1.jpa_depth.JpaDepthApplication;
import com.session1.jpa_depth.entity.Course;
import com.session1.jpa_depth.entity.Passport;
import com.session1.jpa_depth.entity.Review;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@SpringBootTest(classes = JpaDepthApplication.class)
class springDataRepository {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
    SpringCourseRepository object;
	
	


	

}
