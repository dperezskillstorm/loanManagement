package loanManager.api.loanDetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import loanManager.api.loanDetails.models.LoanTransactions;
import loanManager.api.loanDetails.repository.LoanTransactionsRepository;

@Service
public class TransactionService {
	
	@Autowired
	private LoanTransactionsRepository loanTransactionsRepository;
	
	public List<LoanTransactions> findTransactionByLoanNumb(int loanNum) {
		return this.loanTransactionsRepository.findTransactionByLoanNumb(loanNum);
	}





}


