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
@Table(name = "tblTime")
public class TblTime extends Inserted implements Serializable {
	
	public TblTime() {
	}

	public TblTime(int id, @Size(max = 8) String time, @Size(max = 2) String hour, @Size(max = 2) String militaryHour,
	    @Size(max = 2) String minute, @Size(max = 2) String second, @Size(max = 2) String amPm,
	    @Size(max = 2) String standardTime, @Size(max = 2) String timeBand) {
		super();
		this.id = id;
		this.time = time;
		this.hour = hour;
		this.militaryHour = militaryHour;
		this.minute = minute;
		this.second = second;
		this.amPm = amPm;
		this.standardTime = standardTime;
		this.timeBand = timeBand;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3012032230262471967L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 8)
	@Column(name = "time", nullable = true)
	private String time;
	
	@Size(max = 2)
	@Column(name = "hour", nullable = true)
	private String hour;
	
	@Size(max = 2)
	@Column(name = "militaryHour", nullable = true)
	private String militaryHour;
	
	@Size(max = 2)
	@Column(name = "minute", nullable = true)
	private String minute;
	
	@Size(max = 2)
	@Column(name = "second", nullable = true)
	private String second;
	
	@Size(max = 2)
	@Column(name = "amPm", nullable = true)
	private String amPm;
	
	@Size(max = 2)
	@Column(name = "standardTime", nullable = true)
	private String standardTime;
	
	@Size(max = 2)
	@Column(name = "timeBand", nullable = true)
	private String timeBand;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getHour() {
		return hour;
	}
	
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public String getMilitaryHour() {
		return militaryHour;
	}
	
	public void setMilitaryHour(String militaryHour) {
		this.militaryHour = militaryHour;
	}
	
	public String getMinute() {
		return minute;
	}
	
	public void setMinute(String minute) {
		this.minute = minute;
	}
	
	public String getSecond() {
		return second;
	}
	
	public void setSecond(String second) {
		this.second = second;
	}
	
	public String getAmPm() {
		return amPm;
	}
	
	public void setAmPm(String amPm) {
		this.amPm = amPm;
	}
	
	public String getStandardTime() {
		return standardTime;
	}
	
	public void setStandardTime(String standardTime) {
		this.standardTime = standardTime;
	}
	
	public String getTimeBand() {
		return timeBand;
	}
	
	public void setTimeBand(String timeBand) {
		this.timeBand = timeBand;
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
