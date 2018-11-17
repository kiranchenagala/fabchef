package com.fc.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FC_CHEF")
public class Chef {

	@Id
	@Column(name = "CHEF_ID")
	private Long id;

	@Column(name = "CHEF_FULL_NAME")
	private String name;

	@Column(name = "CHEF_NICK_NAME")
	private String nickName;

	@Column(name = "CUISINES")
	private String cuisines;

	@Column(name = "RECIPES")
	private String recipes;

	@Column(name = "LOCATION_ZIP")
	private Integer locationZip;

	@Column(name = "STATE")
	private String state;

	@Column(name = "AVAILABILITY")
	private String availability;

	@Column(name = "PRICE_UNITS")
	private Integer priceUntis;
	
	@Column(name = "PRICE_CURRENCY")
	private String priceCurrency;

	@Column(name = "PRICE_PER")
	private Character pricePerMeasure;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "IS_ACTIVE")
	private Character isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCuisines() {
		return cuisines;
	}

	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}

	public String getRecipes() {
		return recipes;
	}

	public void setRecipes(String recipes) {
		this.recipes = recipes;
	}

	public Integer getLocationZip() {
		return locationZip;
	}

	public void setLocationZip(Integer locationZip) {
		this.locationZip = locationZip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Integer getPriceUntis() {
		return priceUntis;
	}

	public void setPriceUntis(Integer priceUntis) {
		this.priceUntis = priceUntis;
	}

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public Character getPricePerMeasure() {
		return pricePerMeasure;
	}

	public void setPricePerMeasure(Character pricePerMeasure) {
		this.pricePerMeasure = pricePerMeasure;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	

}
