package com.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user_db")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long id;

	@NotEmpty
	@Column(name = "user_name")
	private String name;

	@NotEmpty
	@Column(name = "user_firstName")
	private String firstName;

	public User() {
		super();
	}

	public User(Long id, String name, String firstName) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstName=" + firstName
				+ "]";
	}
}
