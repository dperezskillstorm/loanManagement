package loanManager.api.loanDetails.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="loan_transactions")
public class LoanTransactions {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;
	
	@Column(name = "loan_id")
	private int loanId;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "period")
	private int period;
	
	@Column(name = "payment_amount")
	private double paymentAmount;
	
	@Column(name = "status")
	private String status;
	

	
	public LoanTransactions() {}


	


	public LoanTransactions(long _id, int loanId, String date, int period, double paymentAmount, String firstName,
			String lastName) {
		super();
		this._id = _id;
		this.loanId = loanId;
		this.date = date;
		this.period = period;
		this.paymentAmount = paymentAmount;
		this.status = status;
	
	}





	public long get_id() {
		return _id;
	}





	public void set_id(long _id) {
		this._id = _id;
	}





	public int getLoanId() {
		return loanId;
	}





	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}





	public String getDate() {
		return date;
	}





	public void setDate(String date) {
		this.date = date;
	}





	public int getPeriod() {
		return period;
	}





	public void setPeriod(int period) {
		this.period = period;
	}
	
	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public double getPaymentAmount() {
		return paymentAmount;
	}





	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}





	
	
	
	
	

	
}
