package com.cms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carz")
public class carz {
	
	@Id
	@Column(name="CarNo")
	private String CarNo;
	
	@Column(name="Manufacture")
	private String Manufacture;
	
	@Column(name="Model")
	private  String Model;
	
	@Column(name="KmsRan")
	private int KmsRan;
	
	@Column(name="PriceExpected")
	private int PriceExpected;
	
	@Column(name="NoOfOwners")
	private int NoOfOwners;
	
	public carz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public carz(String carNo, String manufacture, String model, int kmsRan, int priceExpected, int noOfOwners) {
		super();
		CarNo = carNo;
		Manufacture = manufacture;
		Model = model;
		KmsRan = kmsRan;
		PriceExpected = priceExpected;
		NoOfOwners = noOfOwners;
	}

	

	public String getCarNo() {
		return CarNo;
	}

	public void setCarNo(String carNo) {
		CarNo = carNo;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getKmsRan() {
		return KmsRan;
	}

	public void setKmsRan(int kmsRan) {
		KmsRan = kmsRan;
	}

	public int getPriceExpected() {
		return PriceExpected;
	}

	public void setPriceExpected(int priceExpected) {
		PriceExpected = priceExpected;
	}

	public int getNoOfOwners() {
		return NoOfOwners;
	}

	public void setNoOfOwners(int noOfOwners) {
		NoOfOwners = noOfOwners;
	}

	@Override
	public String toString() {
		return "carz [CarNo=" + CarNo + ", Manufacture=" + Manufacture + ", Model=" + Model + ", KmsRan=" + KmsRan
				+ ", PriceExpected=" + PriceExpected + ", NoOfOwners=" + NoOfOwners + "]";
	}
	
	
	
	
	

}
