package com.collegeportal.repository.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CPL_STUDENT")
public class StudentEntity implements Serializable{

	private static final long serialVersionUID = -3932374972801250259L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID", nullable = false, precision = 19)
	private Long studentId;

	@Basic
	@Column(name = "FIRST_NAME", nullable = false, length = 50)
	private String firstName;
	
	@Basic
	@Column(name = "MIDDLE_NAME", nullable = false, length = 50)
	private String middleName;
	
	@Basic
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	private String lastName;
	
	@Basic
	@Column(name = "FATHER_NAME", nullable = false, length = 150)
	private String fatherName;
	
	@Basic
	@Column(name = "MOTHER_NAME", nullable = false, length = 150)
	private String motherName;
}
