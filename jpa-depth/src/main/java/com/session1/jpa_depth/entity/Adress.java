package com.session1.jpa_depth.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {
	
	String line1;
	  String lin2;
	  String line3;
	
  public Adress() {
		super();
	}
public Adress(String line1, String lin2, String line3) {
		super();
		this.line1 = line1;
		this.lin2 = lin2;
		this.line3 = line3;
	}

  
}
