package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
//@Table(name = "Customers") // For Changing Table Name
public class Customer {
	@Id
	@Column(name = "customer_Id") // Changing Column Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_Id;

	@Column(name = "customer_Name", length = 20, nullable = false)
	@OrderBy
	private String cust_Name;

//	@Transient // Don't Show The Column
	@Column(nullable = false)
	private String password;

	@Temporal(TemporalType.DATE)
	private Date doj;

	public Customer(String cust_Name, String password, Date doj) {
		super();
//		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.password = password;
		this.doj = doj;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", password=" + password + ", doj=" + doj
				+ "]";
	}

	
}