package com.collabo.model.settings;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.collabo.model.Inserted;

@Entity
@Table(name = "tblExchangeRate")
public class TblExchangeRate extends Inserted implements Serializable {
	
	public TblExchangeRate() {
	}

	public TblExchangeRate(int id, int rateDate, int srcCurrencyID, int destCurrencyID, double srcDestRate,
	    double destSrcRate) {
		super();
		this.id = id;
		this.rateDate = rateDate;
		this.srcCurrencyID = srcCurrencyID;
		this.destCurrencyID = destCurrencyID;
		this.srcDestRate = srcDestRate;
		this.destSrcRate = destSrcRate;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2267263184162173778L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "rateDate", nullable = true)
	private int rateDate;
	
	@Column(name = "srcCurrencyID", nullable = true)
	private int srcCurrencyID;
	
	@Column(name = "destCurrencyID", nullable = true)
	private int destCurrencyID;
	
	@Column(name = "srcDestRate", nullable = true)
	private double srcDestRate;
	
	@Column(name = "destSrcRate", nullable = true)
	private double destSrcRate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRateDate() {
		return rateDate;
	}
	
	public void setRateDate(int rateDate) {
		this.rateDate = rateDate;
	}
	
	public int getSrcCurrencyID() {
		return srcCurrencyID;
	}
	
	public void setSrcCurrencyID(int srcCurrencyID) {
		this.srcCurrencyID = srcCurrencyID;
	}
	
	public int getDestCurrencyID() {
		return destCurrencyID;
	}
	
	public void setDestCurrencyID(int destCurrencyID) {
		this.destCurrencyID = destCurrencyID;
	}
	
	public double getSrcDestRate() {
		return srcDestRate;
	}
	
	public void setSrcDestRate(double srcDestRate) {
		this.srcDestRate = srcDestRate;
	}
	
	public double getDestSrcRate() {
		return destSrcRate;
	}
	
	public void setDestSrcRate(double destSrcRate) {
		this.destSrcRate = destSrcRate;
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
