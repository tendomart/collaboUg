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
@Table(name = "tblDocuments")
public class TblDocuments extends Inserted implements Serializable {
	
	public TblDocuments() {
	}

	public TblDocuments(int id, int docTypeID, int userID, int resourcePoolID, int projectID, int meetingID,
	    int meetingScheduleID, int taskID, int activityID, @Size(max = 45) String docName,
	    @Size(max = 100) String docDescription, @Size(max = 300) String docFullPath, int docStatus, Date dateInserted,
	    int insertedBy, Date dateModified, int modifiedby) {
		super();
		this.id = id;
		this.docTypeID = docTypeID;
		this.userID = userID;
		this.resourcePoolID = resourcePoolID;
		this.projectID = projectID;
		this.meetingID = meetingID;
		this.meetingScheduleID = meetingScheduleID;
		this.taskID = taskID;
		this.activityID = activityID;
		this.docName = docName;
		this.docDescription = docDescription;
		this.docFullPath = docFullPath;
		this.docStatus = docStatus;
		this.dateInserted = dateInserted;
		this.insertedBy = insertedBy;
		this.dateModified = dateModified;
		this.modifiedby = modifiedby;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3257366333972879117L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "docTypeID")
	private int docTypeID;
	
	@Column(name = "userID")
	private int userID;
	
	@Column(name = "resourcePoolID")
	private int resourcePoolID;
	
	@Column(name = "projectID")
	private int projectID;
	
	@Column(name = "meetingID")
	private int meetingID;
	
	@Column(name = "meetingScheduleID")
	private int meetingScheduleID;
	
	@Column(name = "taskID")
	private int taskID;
	
	@Column(name = "activityID")
	private int activityID;
	
	@Size(max = 45)
	@Column(name = "docName", unique = true)
	private String docName;
	
	@Size(max = 100)
	@Column(name = "docDescription")
	private String docDescription;
	
	@Size(max = 300)
	@Column(name = "docFullPath")
	private String docFullPath;
	
	@Column(name = "docStatus")
	private int docStatus;
	
	@Column(name = "dateInserted")
	private Date dateInserted;
	
	@Column(name = "insertedBy")
	private int insertedBy;
	
	@Column(name = "dateModified")
	private Date dateModified;
	
	@Column(name = "modifiedby")
	private int modifiedby;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getDocTypeID() {
		return docTypeID;
	}
	
	public void setDocTypeID(int docTypeID) {
		this.docTypeID = docTypeID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getResourcePoolID() {
		return resourcePoolID;
	}
	
	public void setResourcePoolID(int resourcePoolID) {
		this.resourcePoolID = resourcePoolID;
	}
	
	public int getProjectID() {
		return projectID;
	}
	
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	
	public int getMeetingID() {
		return meetingID;
	}
	
	public void setMeetingID(int meetingID) {
		this.meetingID = meetingID;
	}
	
	public int getMeetingScheduleID() {
		return meetingScheduleID;
	}
	
	public void setMeetingScheduleID(int meetingScheduleID) {
		this.meetingScheduleID = meetingScheduleID;
	}
	
	public int getTaskID() {
		return taskID;
	}
	
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
	public int getActivityID() {
		return activityID;
	}
	
	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}
	
	public String getDocName() {
		return docName;
	}
	
	public void setDocName(String docName) {
		this.docName = docName;
	}
	
	public String getDocDescription() {
		return docDescription;
	}
	
	public void setDocDescription(String docDescription) {
		this.docDescription = docDescription;
	}
	
	public String getDocFullPath() {
		return docFullPath;
	}
	
	public void setDocFullPath(String docFullPath) {
		this.docFullPath = docFullPath;
	}
	
	public int getDocStatus() {
		return docStatus;
	}
	
	public void setDocStatus(int docStatus) {
		this.docStatus = docStatus;
	}
	
	@Override
	public Date getDateInserted() {
		return dateInserted;
	}
	
	@Override
	public void setDateInserted(Date dateInserted) {
		this.dateInserted = dateInserted;
	}
	
	@Override
	public int getInsertedBy() {
		return insertedBy;
	}
	
	@Override
	public void setInsertedBy(int insertedBy) {
		this.insertedBy = insertedBy;
	}
	
	@Override
	public Date getDateModified() {
		return dateModified;
	}
	
	@Override
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	public int getModifiedby() {
		return modifiedby;
	}
	
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
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
