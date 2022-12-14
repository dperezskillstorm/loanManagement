package loanManager.api.loanDetails.service;

import java.awt.geom.Arc2D.Double;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import loanManager.api.exception.NoSuchRecordExistException;
import loanManager.api.loanDetails.models.LoanDetails;
import loanManager.api.loanDetails.models.LoanTransactions;
import loanManager.api.loanDetails.models.LoanTransactionsDTO;
import loanManager.api.loanDetails.repository.LoanDetailsRepository;
import loanManager.api.loanDetails.repository.LoanTransactionsRepository;


@Service
public class TransactionService {
	
	@Autowired
	private LoanTransactionsRepository loanTransactionsRepository;
	
	@Autowired
	private LoanDetailsRepository loanDetailsRepository;
	
	public List<LoanTransactions> findTransactionsLargerThenAmount(double amount){
		
		List<LoanTransactions> loans = loanTransactionsRepository.findAll();
		return loans.stream().filter(c-> c.getPaymentAmount() > amount)
		.collect(Collectors.toList());
		
	}

		public double getTotalPaymentsforId(long id){
			List<LoanTransactions> loans = loanTransactionsRepository.findAll();
				
			 double total = loans.stream().filter(l-> l.getLoanId() == id).mapToDouble(LoanTransactions::getPaymentAmount).sum();	
			 
			 if (total == 0) {
				 throw new  NoSuchRecordExistException("No record Payments made with id; = " + id);
			 }
			 else {
				 return loans.stream().filter(l-> l.getLoanId() == id).mapToDouble(LoanTransactions::getPaymentAmount).sum();	
			  
			 }
	
				
			
		}
		
		public List<String> getPaymentsThisWeek(String searchDate) {
			return loanTransactionsRepository.getPaymentsThisWeek(searchDate);
		}
		
		
		
//		public LoanTransactionsDTO getLoanDTOInfo(long _id){
//			String firstName;
//			String lastName;
//			
//			LoanTransactions listOfLoans = (LoanTransactions) loanTransactionsRepository.findAll();
//
//			List <LoanTransactions> loans = loanTransactionsRepository.findAll();
//			Optional<LoanDetails> user = loanDetailsRepository.findById(_id);
//			
//			firstName = user.map(u-> u.getFirstName()).get();
//			lastName = user.map(u-> u.getLastName()).get();
//			
//
//				
//			
//			loans.stream().filter(l-> l.getLoanId() == _id);
//			Stream<LoanTransactions> paid =  loans.stream().filter(l-> l.getLoanId() == _id).filter(l-> l.getStatus().equals("Paid"));
//			Stream<LoanTransactions> interest =  loans.stream().filter(l-> l.getLoanId() == _id).filter(l-> l.getStatus().equals("Interest"));
////			
////			LoanDetails loanDetails = new LoanDetails();
////			
//			double totalInterest = ((Stream<LoanTransactions>) interest).mapToDouble(LoanTransactions::getPaymentAmount).sum();
//			double totalPaid = ((Stream<LoanTransactions>) paid).mapToDouble(LoanTransactions::getPaymentAmount).sum();
////	
//			List newList = new ArrayList();
//			newList.add(9);
//			newList.add(8);
//			LoanTransactionsDTO summary = new LoanTransactionsDTO();
//			summary.setInterestPaid(totalInterest);
//			summary.setTotalPaid(totalPaid);
//			summary.setName(lastName +","+firstName);
//			summary.setTransactions(newList);
//			return summary;
//	
			
	//	}

		private String String(Stream<Object> name) {
			// TODO Auto-generated method stub
			return null;
		}



}


