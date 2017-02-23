package com.alibaba.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * @version 2016-11-06 车辆信息表
 */
public class CarInfoTable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;//自增长、主键
	private String orderCode;//工单号
	private String carSpecificModel;//车辆具体型号
	private String carNumber;//车牌号码
	private Date registrationTime;//上牌时间
	private String carBrand;//车辆品牌
	private double mileage;//里程数（公里）
	private String vehicleCondition;//车况评级
	private double evaluatedPrice;//评估价格（元）
	private String vehicleConditionEvaluate;//车况整体评价
	private Date createDate;//创建时间   
	private Date updateDate;//更新时间
	private String remark;//备注
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRegistrationTime() {
		return registrationTime;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getVehicleCondition() {
		return vehicleCondition;
	}
	public void setVehicleCondition(String vehicleCondition) {
		this.vehicleCondition = vehicleCondition;
	}
	public double getEvaluatedPrice() {
		return evaluatedPrice;
	}
	public void setEvaluatedPrice(double evaluatedPrice) {
		this.evaluatedPrice = evaluatedPrice;
	}
	public String getVehicleConditionEvaluate() {
		return vehicleConditionEvaluate;
	}
	public void setVehicleConditionEvaluate(String vehicleConditionEvaluate) {
		this.vehicleConditionEvaluate = vehicleConditionEvaluate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCarSpecificModel() {
		return carSpecificModel;
	}
	public void setCarSpecificModel(String carSpecificModel) {
		this.carSpecificModel = carSpecificModel;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
}
