package loanManager.api.loanDetails.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loanManager.api.loanDetails.models.LoanTransactions;
import loanManager.api.loanDetails.service.TransactionService;

@RestController
@RequestMapping("api/v1/other")
public class OtherControllers {
	
@Autowired
TransactionService transactionService;

@GetMapping("/amount/{amount}")
public List <LoanTransactions >getLoansGreatThanAmount(@PathVariable double amount){
	return transactionService.findTransactionsLargerThenAmount(amount);
}


@GetMapping("/total/{id}")
public  double getAllPayments(@PathVariable long id){
	return transactionService.getTotalPaymentsforId(id);
}


	
	

}
