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

import loanManager.api.loanDetails.models.LoanDetails;
import loanManager.api.loanDetails.repository.LoanDetailsRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class LoanDetailsController {
	@Autowired
	private LoanDetailsRepository loanDetailsRepository;
	
	@GetMapping("/loanDetails")
	public List<LoanDetails> getAllLoanDetails(){
		return loanDetailsRepository.findAll();
	}
	
	@GetMapping("/loanDetails/{_id}")
	public ResponseEntity<Optional<LoanDetails>> FindLoanDetailsById(@PathVariable Long _id) {
		Optional<LoanDetails> loanDetails = this.loanDetailsRepository.findById(_id);
		return ResponseEntity.ok(loanDetails);
		
	}
	
	@PostMapping("/loanDetails")
	public LoanDetails createLoanDetails(@RequestBody LoanDetails loanDetails) {
		return loanDetailsRepository.save(loanDetails);
	}
	
	@DeleteMapping("/loanDetails/{_id}")
	public ResponseEntity<Long> DeleteLoanDetails(@PathVariable Long _id) {
		loanDetailsRepository.deleteById(_id);
		return ResponseEntity.ok(_id);
		
	}
	
	
}



