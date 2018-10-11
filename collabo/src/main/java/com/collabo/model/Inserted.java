package com.collabo.model;

import java.util.Date;

import javax.persistence.Column;

public abstract class Inserted {
	
	@Column(name = "dateInserted", nullable = true)
	private Date dateInserted;
	
	@Column(name = "insertedBy", nullable = true)
	private int insertedBy;
	
	@Column(name = "dateModified", nullable = true)
	private Date dateModified;
	
	@Column(name = "modifiedBy", nullable = true)
	private int modifiedBy;
	
	public Date getDateInserted() {
		return dateInserted;
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
	
	public void setDateInserted(Date dateInserted) {
		this.dateInserted = dateInserted;
	}
	
}
