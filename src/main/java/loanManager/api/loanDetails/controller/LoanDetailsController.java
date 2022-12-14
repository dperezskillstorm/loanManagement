package loanManager.api.loanDetails.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loanManager.api.exception.ResourceNotFoundException;
import loanManager.api.loanDetails.models.LoanDetails;
import loanManager.api.loanDetails.repository.LoanDetailsRepository;
import loanManager.api.loanDetails.service.LoanDetailsService;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class LoanDetailsController {
	@Autowired
	private LoanDetailsRepository loanDetailsRepository;
	
	@Autowired
	private LoanDetailsService loanDetailsService;
	
	@GetMapping("/loanDetails/ActiveAccounts")
	public List<LoanDetails> getAccountInfo(){
		return loanDetailsService.getAccountInfo();
	}
	
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
	
	@PatchMapping("/loanDetails/{_id}")
    public ResponseEntity<LoanDetails> updateEmployee(@PathVariable long _id,@RequestBody LoanDetails loanDetails) {
        LoanDetails updatedDetails = loanDetailsRepository.findById(_id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + _id));
        
        updatedDetails.setDate(loanDetails.getDate());
        updatedDetails.setAssignedTo(loanDetails.getAssignedTo());
		updatedDetails.setFirstName(loanDetails.getFirstName());
		updatedDetails.setInterestRate(loanDetails.getInterestRate());
		updatedDetails.setLastName(loanDetails.getLastName());
		updatedDetails.setLoanAmount(loanDetails.getLoanAmount());
		updatedDetails.setLoanAmount(loanDetails.getLoanAmount());
		updatedDetails.setPaymentAmount(loanDetails.getPaymentAmount());
		updatedDetails.setPeriods(loanDetails.getPeriods());
		updatedDetails.setStatus(loanDetails.getStatus());
		updatedDetails.setNotes(loanDetails.getNotes());

		loanDetailsRepository.save(updatedDetails);
        return ResponseEntity.ok(updatedDetails);
    }
	
	
	
	@DeleteMapping("/loanDetails/{_id}")
	public ResponseEntity<Long> DeleteLoanDetails(@PathVariable Long _id) {
		loanDetailsRepository.deleteById(_id);
		return ResponseEntity.ok(_id);
		
	}
	
	
}



