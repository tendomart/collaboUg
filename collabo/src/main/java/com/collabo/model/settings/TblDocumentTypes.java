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
@Table(name = "tblDocumentTypes")
public class TblDocumentTypes extends Inserted implements Serializable {
	
	public TblDocumentTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TblDocumentTypes(int id, @Size(max = 45) String cTypeName, @Size(max = 100) String cTypeDescription) {
		super();
		this.id = id;
		this.cTypeName = cTypeName;
		this.cTypeDescription = cTypeDescription;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5967678106525798783L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "dTypeName", nullable = true)
	private String cTypeName;
	
	@Size(max = 100)
	@Column(name = "dTypeDescription", nullable = true)
	private String cTypeDescription;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getcTypeName() {
		return cTypeName;
	}
	
	public void setcTypeName(String cTypeName) {
		this.cTypeName = cTypeName;
	}
	
	public String getcTypeDescription() {
		return cTypeDescription;
	}
	
	public void setcTypeDescription(String cTypeDescription) {
		this.cTypeDescription = cTypeDescription;
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
