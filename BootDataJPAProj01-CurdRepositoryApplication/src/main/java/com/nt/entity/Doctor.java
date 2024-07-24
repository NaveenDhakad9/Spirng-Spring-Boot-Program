package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DoctorInfo")
@Data
public class Doctor {
	@Column(name="docId")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="gen1",sequenceName = "docseq",initialValue = 2,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
    private Integer docID;
	@Column(name="docname",length=30)
    private String docName;
	@Column(name="specialization",length=30)
    private String specialization;
	@Column(name="income")
    private Double income;
}
