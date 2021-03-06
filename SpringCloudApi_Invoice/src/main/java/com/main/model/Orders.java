package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderTB")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String custName;
	private String custAddr;
	private String orderStatus;
	private int productId;
	private int quantity;
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Orders(int orderId, String custName, String custAddr, String orderStatus, int productId, int quantity) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.custAddr = custAddr;
		this.orderStatus = orderStatus;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	
	public String toString() {
		return "Orders [orderId=" + orderId + ", custName=" + custName + ", custAddr=" + custAddr + ", orderStatus="
				+ orderStatus + ", productId=" + productId + ", quantity=" + quantity + "]";
	}
	
	public Orders() {
		
	}
	
	
	
	
	

}
