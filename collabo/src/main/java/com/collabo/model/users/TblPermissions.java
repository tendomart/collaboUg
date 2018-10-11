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
@Table(name = "tblPermissions")
public class TblPermissions implements Serializable {
	
	public TblPermissions() {}

	public TblPermissions(int id, @Size(max = 45) String permissionName, @Size(max = 100) String permissionDescription,
	    Date dateInserted, int insertedBy, Date dateModified, int modifiedBy) {
		super();
		this.id = id;
		this.permissionName = permissionName;
		this.permissionDescription = permissionDescription;
		this.dateInserted = dateInserted;
		this.insertedBy = insertedBy;
		this.dateModified = dateModified;
		this.modifiedBy = modifiedBy;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@Size(max = 45)
	@Column(name = "permissionName", unique = true)
	String permissionName;
	

	@Size(max = 100)
	@Column(name = "permissionDescription")
	String permissionDescription;
	
	@Column(name = "dateInserted")
	private Date dateInserted;
	
	@Column(name = "insertedBy")
	private int insertedBy;
	
	@Column(name = "dateModified")
	private Date dateModified;
	
	@Column(name = "modifiedBy")
	private int modifiedBy;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPermissionName() {
		return permissionName;
	}
	
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	public String getPermissionDescription() {
		return permissionDescription;
	}
	
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
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
	
	public int getModifiedBy() {
		return modifiedBy;
	}
	
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
