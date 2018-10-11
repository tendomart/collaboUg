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
@Table(name = "tblCurrencies")
public class TblCurrencies extends Inserted implements Serializable {
	
	public TblCurrencies() {
	}

	public TblCurrencies(int id, @Size(max = 45) String currencyName, int currencyCode,
	    @Size(max = 10) String currencyShortName, int currencyType, int currencyStatus) {
		super();
		this.id = id;
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.currencyShortName = currencyShortName;
		this.currencyType = currencyType;
		this.currencyStatus = currencyStatus;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6862389867760252990L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "currencyName", nullable = true)
	private String currencyName;
	
	@Column(name = "currencyCode", nullable = true)
	private int currencyCode;
	
	@Size(max = 10)
	@Column(name = "currencyShortName", nullable = true)
	private String currencyShortName;
	
	@Column(name = "currencyType", nullable = true)
	private int currencyType;
	
	@Column(name = "currencyStatus", nullable = true)
	private int currencyStatus;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}
	
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	public int getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(int currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public String getCurrencyShortName() {
		return currencyShortName;
	}
	
	public void setCurrencyShortName(String currencyShortName) {
		this.currencyShortName = currencyShortName;
	}
	
	public int getCurrencyType() {
		return currencyType;
	}
	
	public void setCurrencyType(int currencyType) {
		this.currencyType = currencyType;
	}
	
	public int getCurrencyStatus() {
		return currencyStatus;
	}
	
	public void setCurrencyStatus(int currencyStatus) {
		this.currencyStatus = currencyStatus;
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
