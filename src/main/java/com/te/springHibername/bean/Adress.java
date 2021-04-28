package com.te.springHibername.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="adress_Info")

public class Adress  implements Serializable{
	
	@Id
	@Column
	private int pincode;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@OneToOne
	private Student student;
}
