package loanManager.api.loanDetails.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loanManager.api.loanDetails.models.LoanTransactions;
import loanManager.api.loanDetails.repository.LoanTransactionsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class LoanTransactionsController {
	@Autowired
	private LoanTransactionsRepository loanTransactionsRepository;
	
	@GetMapping("/loanTransactions")
	public List<LoanTransactions> getAllLoansTransactions(){
		return loanTransactionsRepository.findAll();
	}
	
	@GetMapping("/loanTransactions/{_id}")
	public ResponseEntity<Optional<LoanTransactions>> FindLoansTransactionsById(@PathVariable Long _id) {
		Optional<LoanTransactions> loansTransactions = this.loanTransactionsRepository.findById(_id);
		return ResponseEntity.ok(loansTransactions);
		
	}
	
	@PostMapping("/loanTransactions")
	public LoanTransactions createLoansTransactions(@RequestBody LoanTransactions loansTransactions) {
		return loanTransactionsRepository.save(loansTransactions);
	}
	
	@DeleteMapping("/loanTransactions/{_id}")
	public ResponseEntity<Long> DeleteLoansTransactions(@PathVariable Long _id) {
		loanTransactionsRepository.deleteById(_id);
		return ResponseEntity.ok(_id);
		
	}
	
	
}



