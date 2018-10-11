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
@Table(name = "tblTemplateTypes")
public class TblTemplateTypes extends Inserted implements Serializable {
	
	public TblTemplateTypes() {
	}

	public TblTemplateTypes(int id, @Size(max = 45) String tTypeName, @Size(max = 100) String tTypeDescription) {
		super();
		this.id = id;
		this.tTypeName = tTypeName;
		this.tTypeDescription = tTypeDescription;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -481812368593135748L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "tTypeName", nullable = true)
	private String tTypeName;
	
	@Size(max = 100)
	@Column(name = "tTypeDescription", nullable = true)
	private String tTypeDescription;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String gettTypeName() {
		return tTypeName;
	}
	
	public void settTypeName(String tTypeName) {
		this.tTypeName = tTypeName;
	}
	
	public String gettTypeDescription() {
		return tTypeDescription;
	}
	
	public void settTypeDescription(String tTypeDescription) {
		this.tTypeDescription = tTypeDescription;
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
