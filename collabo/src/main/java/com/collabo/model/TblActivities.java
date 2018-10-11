package com.collabo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tblActivities")
public class TblActivities extends Inserted implements Serializable {
	
	public TblActivities(int id, @Size(max = 45) String activityName, @Size(max = 100) String activityDescription,
	    int taskID, int activityOrder, int priority, int plannedStartDate, int plannedEndDate, int plannedStartTime,
	    int plannedEndTime, int actualStartDate, int actualEndDate, int actualStartTime, int actualEndTime,
	    int activityStatus, int completionStatus, Date dateInserted, int insertedBy, Date dateModified, int modifiedBy) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.activityDescription = activityDescription;
		this.taskID = taskID;
		this.activityOrder = activityOrder;
		this.priority = priority;
		this.plannedStartDate = plannedStartDate;
		this.plannedEndDate = plannedEndDate;
		this.plannedStartTime = plannedStartTime;
		this.plannedEndTime = plannedEndTime;
		this.actualStartDate = actualStartDate;
		this.actualEndDate = actualEndDate;
		this.actualStartTime = actualStartTime;
		this.actualEndTime = actualEndTime;
		this.activityStatus = activityStatus;
		this.completionStatus = completionStatus;
		this.dateInserted = dateInserted;
		this.insertedBy = insertedBy;
		this.dateModified = dateModified;
		this.modifiedBy = modifiedBy;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4314328049891506569L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 45)
	@Column(name = "activityName", nullable = true)
	private String activityName;
	
	@Size(max = 100)
	@Column(name = "activityDescription", nullable = true)
	private String activityDescription;
	
	@Column(name = "taskID", nullable = true)
	private int taskID;
	
	@Column(name = "activityOrder", nullable = true)
	private int activityOrder;
	
	@Column(name = "priority", nullable = true)
	private int priority;
	
	@Column(name = "plannedStartDate", nullable = true)
	private int plannedStartDate;
	
	@Column(name = "plannedEndDate", nullable = true)
	private int plannedEndDate;
	
	@Column(name = "plannedStartTime", nullable = true)
	private int plannedStartTime;
	
	@Column(name = "plannedEndTime", nullable = true)
	private int plannedEndTime;
	
	@Column(name = "actualStartDate", nullable = true)
	private int actualStartDate;
	
	@Column(name = "actualEndDate", nullable = true)
	private int actualEndDate;
	
	@Column(name = "actualStartTime", nullable = true)
	private int actualStartTime;
	
	@Column(name = "actualEndTime", nullable = true)
	private int actualEndTime;
	
	@Column(name = "activityStatus", nullable = true)
	private int activityStatus;
	
	@Column(name = "completionStatus", nullable = true)
	private int completionStatus;
	
	@Column(name = "dateInserted")
	private Date dateInserted;
	
	@Column(name = "insertedBy")
	private int insertedBy;
	
	@Column(name = "dateModified")
	private Date dateModified;
	
	@Column(name = "modifiedBy")
	private int modifiedBy;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getActivityName() {
		return activityName;
	}
	
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	public String getActivityDescription() {
		return activityDescription;
	}
	
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	
	public int getTaskID() {
		return taskID;
	}
	
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
	public int getActivityOrder() {
		return activityOrder;
	}
	
	public void setActivityOrder(int activityOrder) {
		this.activityOrder = activityOrder;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPlannedStartDate() {
		return plannedStartDate;
	}
	
	public void setPlannedStartDate(int plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}
	
	public int getPlannedEndDate() {
		return plannedEndDate;
	}
	
	public void setPlannedEndDate(int plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}
	
	public int getPlannedStartTime() {
		return plannedStartTime;
	}
	
	public void setPlannedStartTime(int plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}
	
	public int getPlannedEndTime() {
		return plannedEndTime;
	}
	
	public void setPlannedEndTime(int plannedEndTime) {
		this.plannedEndTime = plannedEndTime;
	}
	
	public int getActualStartDate() {
		return actualStartDate;
	}
	
	public void setActualStartDate(int actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	
	public int getActualEndDate() {
		return actualEndDate;
	}
	
	public void setActualEndDate(int actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
	
	public int getActualStartTime() {
		return actualStartTime;
	}
	
	public void setActualStartTime(int actualStartTime) {
		this.actualStartTime = actualStartTime;
	}
	
	public int getActualEndTime() {
		return actualEndTime;
	}
	
	public void setActualEndTime(int actualEndTime) {
		this.actualEndTime = actualEndTime;
	}
	
	public int getActivityStatus() {
		return activityStatus;
	}
	
	public void setActivityStatus(int activityStatus) {
		this.activityStatus = activityStatus;
	}
	
	public int getCompletionStatus() {
		return completionStatus;
	}
	
	public void setCompletionStatus(int completionStatus) {
		this.completionStatus = completionStatus;
	}
	
	@Override
	public Date getDateInserted() {
		return dateInserted;
	}
	
	public void setDateInserted(Date dateInserted) {
		this.dateInserted = dateInserted;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
