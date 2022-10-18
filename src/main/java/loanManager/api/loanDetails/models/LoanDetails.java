package loanManager.api.loanDetails.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="loan_details")
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	
	@Column(name = "loan_amount")
	private double loanAmount;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "periods")
	private int periods;
	
	@Column(name = "interest_rate")
	private double interestRate;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "status")
	private String status;
	
	public LoanDetails() {}


	public LoanDetails(long _id, double loanAmount, String date, int periods, double interestRate, String firstName,
			String lastName, String status) {
		super();
		this._id = _id;
		this.loanAmount = loanAmount;
		this.date = date;
		this.periods = periods;
		this.interestRate = interestRate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}


	public long get_id() {
		return _id;
	}


	public void set_id(long _id) {
		this._id = _id;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getPeriods() {
		return periods;
	}


	public void setPeriods(int periods) {
		this.periods = periods;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

	
}
