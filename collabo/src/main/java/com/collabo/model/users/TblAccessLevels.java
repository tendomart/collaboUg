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
@Table(name = "tblAccessLevels")
public class TblAccessLevels implements Serializable {
	
	public TblAccessLevels() {
	}

	public TblAccessLevels(int id, @Size(max = 45) String levelName, @Size(max = 100) String levelDescription,
	    Date dateInserted, int insertedBy, Date dateModified, int modifiedBy) {
		super();
		this.id = id;
		this.levelName = levelName;
		this.levelDescription = levelDescription;
		this.dateInserted = dateInserted;
		this.insertedBy = insertedBy;
		this.dateModified = dateModified;
		this.modifiedBy = modifiedBy;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2577330225085904462L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "levelName", unique = true)
	private String levelName;
	
	@Size(max = 100)
	@Column(name = "levelDescription")
	private String levelDescription;
	
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
	
	public String getLevelName() {
		return levelName;
	}
	
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	
	public String getLevelDescription() {
		return levelDescription;
	}
	
	public void setLevelDescription(String levelDescription) {
		this.levelDescription = levelDescription;
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
