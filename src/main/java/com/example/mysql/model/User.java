/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mysql.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




import lombok.Data;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable{


	private static final long serialVersionUID = 8184276138956628417L;
	
	@Id
	@Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="firstname",nullable = false)
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="age",nullable = false)
	private int age;
	@Column(name="address")
	private String address;
	@Column(name="active")
	private boolean active;
	@Column(name="startDate")
	private Date startDate;


}
