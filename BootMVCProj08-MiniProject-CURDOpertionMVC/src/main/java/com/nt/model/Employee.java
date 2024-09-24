package com.nt.model;

import java.io.Serializable;


import jakarta.persistence.Column;
//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@Entity
@Table(name="emp")
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee implements Serializable{
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "empIdSeq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	@Column(length = 20)
	private String ename;
	
	@Column(length = 20)
	private String job;

	private Integer sal;
	
   
}
