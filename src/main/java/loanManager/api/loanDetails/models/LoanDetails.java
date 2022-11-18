package loanManager.api.loanDetails.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name ="loan_details")
public class LoanDetails {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
	private long _id;
	
	@Column(name = "loan_amount")
	private double loanAmount;
	
	@Column(name = "payment_amount")
	private double paymentAmount;
	
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
	
	@Column(name = "assigned_to")
	private String assignedTo;
	
	@Column(name = "notes")
	private String notes;


	public LoanDetails() {}




	public LoanDetails(long _id, double loanAmount, double paymentAmount, String date, int periods, double interestRate, String firstName,
			String lastName, String status, String assignedTo,String notes) {
		super();
		this._id = _id;
		this.loanAmount = loanAmount;
		this.date = date;
		this.periods = periods;
		this.interestRate = interestRate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
		this.paymentAmount = paymentAmount;
		this.assignedTo = assignedTo;
		this.notes = notes;
	}
	

	
	public String getAssignedTo() {
		return assignedTo;
	}


	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
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
	
	public double getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
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
