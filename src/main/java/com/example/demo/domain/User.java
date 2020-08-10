package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
	private int seq;
	private String name;
	private String country;
	
	public User() {
		this.seq = 0;
		this.name = null;
		this.country = null;			
	}

}

