package com.te.springHibername.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name="student_Info")
public class Student implements Serializable{

		@Id
		@Column
		private int id;
		
		@Column
		private String name;
		
		@Column
		private String gender;

		@Autowired(required=false)
		@OneToOne
		private Adress adress;
}
