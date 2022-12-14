package loanManager.api.loanDetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loanManager.api.loanDetails.models.LoanDetails;
import loanManager.api.loanDetails.repository.LoanDetailsRepository;

@Service
public class LoanDetailsService {
	
	@Autowired
	LoanDetailsRepository loanDetailsRepository;
	
	//let make a method that uses repo and add logic to it like steam
	
	public List<LoanDetails> getAccountInfo(){
		List<LoanDetails> loan = loanDetailsRepository.findAll();
		return loan
				.stream().filter(l -> l.getStatus().equals("Active"))
				//.map(l -> l.getFirstName() + l.getLastName())
				.collect(Collectors.toList());
	}

}
