package com.src.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class TraineeDetails {
	@Id
   private int tId;
   private String tName;
   private String tLoction;
   private String tDomain;
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public String gettLoction() {
	return tLoction;
}
public void settLoction(String tLoction) {
	this.tLoction = tLoction;
}
public String gettDomain() {
	return tDomain;
}
public void settDomain(String tDomain) {
	this.tDomain = tDomain;
}
   
   
}
