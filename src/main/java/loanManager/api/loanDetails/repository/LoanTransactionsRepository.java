package loanManager.api.loanDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import loanManager.api.loanDetails.models.LoanTransactions;

@Repository
public interface LoanTransactionsRepository extends JpaRepository<LoanTransactions, Long> {

@Query(value = "select l.first_name, l.last_name, t.payment_amount, t.date, t.status from transactions_ledger t  inner join loan_details l ON l._id=t.loan_id WHERE WEEK(DATE(t.date),0) = WEEK(DATE(:searchDate),0)"
		,nativeQuery=true)
public List<String> getPaymentsThisWeek(String searchDate);

public List<LoanTransactions> findByLoanId(int _id);

}






