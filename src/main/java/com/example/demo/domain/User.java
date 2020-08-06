package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
	private int seq;
	private String name;
	private String country;
}
