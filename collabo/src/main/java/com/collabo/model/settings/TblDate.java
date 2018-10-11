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
@Table(name = "tblDate")
public class TblDate extends Inserted implements Serializable {
	
	public TblDate() {
	}

	public TblDate(int id, Date date, @Size(max = 2) String day, @Size(max = 4) String daySuffix,
	    @Size(max = 9) String dayOfWeek, int dayOfMonth, int dayOfYear, int weekOfYear, int weekOfMonth,
	    @Size(max = 2) String month, @Size(max = 10) String monthName, int quater, @Size(max = 6) String quaterName,
	    int year, @Size(max = 10) String standardDate, @Size(max = 50) String holidayText) {
		super();
		this.id = id;
		this.date = date;
		this.day = day;
		this.daySuffix = daySuffix;
		this.dayOfWeek = dayOfWeek;
		this.dayOfMonth = dayOfMonth;
		this.dayOfYear = dayOfYear;
		this.weekOfYear = weekOfYear;
		this.weekOfMonth = weekOfMonth;
		this.month = month;
		this.monthName = monthName;
		this.quater = quater;
		this.quaterName = quaterName;
		this.year = year;
		this.standardDate = standardDate;
		this.holidayText = holidayText;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7720890693063645544L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "date", nullable = true)
	private Date date;
	
	@Size(max = 2)
	@Column(name = "day", nullable = true)
	private String day;
	
	@Size(max = 4)
	@Column(name = "daySuffix", nullable = true)
	private String daySuffix;
	
	@Size(max = 9)
	@Column(name = "dayOfWeek", nullable = true)
	private String dayOfWeek;
	
	@Column(name = "dayOfMonth", nullable = true)
	private int dayOfMonth;
	
	@Column(name = "dayOfYear", nullable = true)
	private int dayOfYear;
	
	@Column(name = "weekOfYear", nullable = true)
	private int weekOfYear;
	
	@Column(name = "weekOfMonth", nullable = true)
	private int weekOfMonth;
	
	@Size(max = 2)
	@Column(name = "month", nullable = true)
	private String month;
	
	@Size(max = 10)
	@Column(name = "monthName", nullable = true)
	private String monthName;
	
	@Column(name = "quater", nullable = true)
	private int quater;
	
	@Size(max = 6)
	@Column(name = "quaterName", nullable = true)
	private String quaterName;
	
	@Column(name = "year", nullable = true)
	private int year;
	
	@Size(max = 10)
	@Column(name = "standardDate", nullable = true)
	private String standardDate;
	
	@Size(max = 50)
	@Column(name = "holidayText", nullable = true)
	private String holidayText;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getDaySuffix() {
		return daySuffix;
	}
	
	public void setDaySuffix(String daySuffix) {
		this.daySuffix = daySuffix;
	}
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public int getDayOfYear() {
		return dayOfYear;
	}
	
	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}
	
	public int getWeekOfYear() {
		return weekOfYear;
	}
	
	public void setWeekOfYear(int weekOfYear) {
		this.weekOfYear = weekOfYear;
	}
	
	public int getWeekOfMonth() {
		return weekOfMonth;
	}
	
	public void setWeekOfMonth(int weekOfMonth) {
		this.weekOfMonth = weekOfMonth;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getMonthName() {
		return monthName;
	}
	
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	
	public int getQuater() {
		return quater;
	}
	
	public void setQuater(int quater) {
		this.quater = quater;
	}
	
	public String getQuaterName() {
		return quaterName;
	}
	
	public void setQuaterName(String quaterName) {
		this.quaterName = quaterName;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getStandardDate() {
		return standardDate;
	}
	
	public void setStandardDate(String standardDate) {
		this.standardDate = standardDate;
	}
	
	public String getHolidayText() {
		return holidayText;
	}
	
	public void setHolidayText(String holidayText) {
		this.holidayText = holidayText;
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
