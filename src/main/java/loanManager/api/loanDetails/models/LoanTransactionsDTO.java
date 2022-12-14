package loanManager.api.loanDetails.models;

import java.util.List;

public class LoanTransactionsDTO {
	private double totalPaid;
			
	private double interestPaid;
	
	private String name;
	
	private int paymentsLeft;
	
	private List transactions;

		public double getTotalPaid() {
			return totalPaid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPaymentsLeft() {
			return paymentsLeft;
		}

		public void setPaymentsLeft(int paymentsLeft) {
			this.paymentsLeft = paymentsLeft;
		}

		public List getTransactions() {
			return transactions;
		}

		public void setTransactions(List transactions) {
			this.transactions = transactions;
		}

		public void setTotalPaid(double totalPaid) {
			this.totalPaid = totalPaid;
		}

		public double getInterestPaid() {
			return interestPaid;
		}

		public void setInterestPaid(double interestPaid) {
			this.interestPaid = interestPaid;
		}
		
		
	}



