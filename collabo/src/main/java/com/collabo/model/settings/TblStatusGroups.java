package com.collabo.model.settings;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.collabo.model.Inserted;

@Entity
@Table(name = "tblStatusGroups")
public class TblStatusGroups extends Inserted implements Serializable {
	
	public TblStatusGroups() {
	}

	public TblStatusGroups(int id, @Size(max = 45) String sGroupName, @Size(max = 100) String sGroupDescription) {
		super();
		this.id = id;
		this.sGroupName = sGroupName;
		this.sGroupDescription = sGroupDescription;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2194250793419550281L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "sGroupName", nullable = true)
	private String sGroupName;
	
	@Size(max = 100)
	@Column(name = "sGroupDescription", nullable = true)
	private String sGroupDescription;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getsGroupName() {
		return sGroupName;
	}
	
	public void setsGroupName(String sGroupName) {
		this.sGroupName = sGroupName;
	}
	
	public String getsGroupDescription() {
		return sGroupDescription;
	}
	
	public void setsGroupDescription(String sGroupDescription) {
		this.sGroupDescription = sGroupDescription;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public Date getDateInserted() {
		// TODO Auto-generated method stub
		return super.getDateInserted();
	}
	
	@Override
	public void setDateInserted(Date dateInserted) {
		// TODO Auto-generated method stub
		super.setDateInserted(dateInserted);
	}
	
	@Override
	public Date getDateModified() {
		// TODO Auto-generated method stub
		return super.getDateModified();
	}
	
	@Override
	public void setDateModified(Date dateModified) {
		// TODO Auto-generated method stub
		super.setDateModified(dateModified);
	}
	
	@Override
	public int getInsertedBy() {
		// TODO Auto-generated method stub
		return super.getInsertedBy();
	}
	
	@Override
	public void setInsertedBy(int insertedBy) {
		// TODO Auto-generated method stub
		super.setInsertedBy(insertedBy);
	}
	
	@Override
	public int getModifiedBy() {
		// TODO Auto-generated method stub
		return super.getModifiedBy();
	}
	
	@Override
	public void setModifiedBy(int modifiedBy) {
		// TODO Auto-generated method stub
		super.setModifiedBy(modifiedBy);
	}
	
}
