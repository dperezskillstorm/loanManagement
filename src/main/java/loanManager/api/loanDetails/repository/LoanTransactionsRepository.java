package loanManager.api.loanDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import loanManager.api.loanDetails.models.LoanTransactions;

@Repository
public interface LoanTransactionsRepository extends JpaRepository<LoanTransactions, Long> {
	
//	@Query(value = " SELECT * FROM transactions  t where t.loan_id = :loanNum ",nativeQuery = true) 
//		public List<LoanTransactions> findTransactionByLoanNumb(@Param("loanNum")int _loanNum);
//
//}

@Query(value = "select * from loan_transactions l where l.loan_id = :loanNum",nativeQuery = true) 
public List<LoanTransactions> findTransactionByLoanNumb(@Param("loanNum")int loanNum);



public List<LoanTransactions> findByLoanId(int _id);






}




