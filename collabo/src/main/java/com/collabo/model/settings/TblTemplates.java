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
@Table(name = "TblTemplates")
public class TblTemplates extends Inserted implements Serializable {
	
	public TblTemplates() {
	}

	public TblTemplates(int id, int templateTypeID, @Size(max = 45) String templateName,
	    @Size(max = 100) String templateDescription, @Size(max = 300) String templateDetails) {
		super();
		this.id = id;
		this.templateTypeID = templateTypeID;
		this.templateName = templateName;
		this.templateDescription = templateDescription;
		this.templateDetails = templateDetails;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7403550252302396364L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "templateTypeID", nullable = true)
	private int templateTypeID;
	
	@Size(max = 45)
	@Column(name = "templateName", nullable = true)
	private String templateName;
	
	@Size(max = 100)
	@Column(name = "templateDescription", nullable = true)
	private String templateDescription;
	
	@Size(max = 300)
	@Column(name = "templateDetails", nullable = true)
	private String templateDetails;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTemplateTypeID() {
		return templateTypeID;
	}
	
	public void setTemplateTypeID(int templateTypeID) {
		this.templateTypeID = templateTypeID;
	}
	
	public String getTemplateName() {
		return templateName;
	}
	
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	
	public String getTemplateDescription() {
		return templateDescription;
	}
	
	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}
	
	public String getTemplateDetails() {
		return templateDetails;
	}
	
	public void setTemplateDetails(String templateDetails) {
		this.templateDetails = templateDetails;
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
