package com.collabo.model.users;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tblUsers")
public class TblUsers implements Serializable {
	


public TblUsers() {
	// TODO Auto-generated constructor stub
}
	public TblUsers(int id, @Size(max = 45) String userName, @Size(max = 45) String password, @Size(max = 45) String email,
	    @Size(max = 45) String firstName, @Size(max = 45) String lastName, String permissions, int userStatus,
	    Date dateInserted, int insertedBy, Date dateModified, int modifiedby) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.permissions = permissions;
		this.userStatus = userStatus;
		this.dateInserted = dateInserted;
		this.insertedBy = insertedBy;
		this.dateModified = dateModified;
		this.modifiedby = modifiedby;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 591444974787567590L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "userName", unique = true)
	private String userName;
	
	@Size(max = 45)
	@Column(name = "password")
	private String password;
	
	@Size(max = 45)
	@Column(name = "email")
	private String email;
	
	@Size(max = 45)
	@Column(name = "firstName")
	private String firstName;
	
	@Size(max = 45)
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "permissions")
	private String permissions;
	
	@Column(name = "userStatus")
	private int userStatus = 0;
	
	@Column(name = "dateInserted")
	private Date dateInserted;
	
	@Column(name = "insertedBy")
	private int insertedBy;
	
	@Column(name = "dateModified")
	private Date dateModified;
	
	@Column(name = "modifiedby")
	private int modifiedby;
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getPermissions() {
		return permissions;
	}

	
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	
	public int getUserStatus() {
		return userStatus;
	}

	
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	
	public Date getDateInserted() {
		return dateInserted;
	}

	
	public void setDateInserted(Date dateInserted) {
		this.dateInserted = dateInserted;
	}

	
	public int getInsertedBy() {
		return insertedBy;
	}

	
	public void setInsertedBy(int insertedBy) {
		this.insertedBy = insertedBy;
	}

	
	public Date getDateModified() {
		return dateModified;
	}

	
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	
	public int getModifiedby() {
		return modifiedby;
	}

	
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
