package com.collabo.model.settings;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.collabo.model.Inserted;
@Entity
@Table(name = "tblStatus")
public class TblStatus extends Inserted implements Serializable{
	
	public TblStatus() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8679641837793705881L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

}
