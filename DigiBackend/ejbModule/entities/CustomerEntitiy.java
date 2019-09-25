package entities;
 
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Customer_tbl")
public class CustomerEntitiy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long trans_Code;
	
	private String source_Passport;
	private String custName;
	private String dest_Passport;
	private String dest_Bank;
	private String dest_Country;
	private String acc_Num;
	private double Amount;
	
	
	public String getSource_Passport() {
		return source_Passport;
	}
	public void setSource_Passport(String source_Passport) {
		this.source_Passport = source_Passport;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getDest_Passport() {
		return dest_Passport;
	}
	public void setDest_Passport(String dest_Passport) {
		this.dest_Passport = dest_Passport;
	}
	public String getDest_Bank() {
		return dest_Bank;
	}
	public void setDest_Bank(String dest_Bank) {
		this.dest_Bank = dest_Bank;
	}
	public String getDest_Country() {
		return dest_Country;
	}
	public void setDest_Country(String dest_Country) {
		this.dest_Country = dest_Country;
	}
	public String getAcc_Num() {
		return acc_Num;
	}
	public void setAcc_Num(String acc_Num) {
		this.acc_Num = acc_Num;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	
}
