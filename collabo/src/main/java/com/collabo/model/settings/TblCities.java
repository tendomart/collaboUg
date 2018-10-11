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
@Table(name = "tblCities")
public class TblCities extends Inserted implements Serializable {
	
	public TblCities() {
	}

	public TblCities(int id, int countryID, @Size(max = 45) String cityName) {
		super();
		this.id = id;
		this.countryID = countryID;
		this.cityName = cityName;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2619270596102921418L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "countryID", nullable = true)
	private int countryID;
	
	@Size(max = 45)
	@Column(name = "cityName", nullable = true)
	private String cityName;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCountryID() {
		return countryID;
	}
	
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
