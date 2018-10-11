package com.collabo.model.users;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.collabo.model.Inserted;

@Entity
@Table(name = "loginAndAuthentication")
public class LoginAndAuthentication extends Inserted implements Serializable{
	
	public LoginAndAuthentication() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7838611785334718680L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
}
