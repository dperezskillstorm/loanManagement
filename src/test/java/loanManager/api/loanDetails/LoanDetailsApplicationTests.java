package loanManager.api.loanDetails;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import loanManager.api.loanDetails.models.LoanDetails;
import loanManager.api.loanDetails.repository.LoanDetailsRepository;

@SpringBootTest
class LoanDetailsApplicationTest {
	
	@Autowired
	private LoanDetailsRepository repo;

	//test for saving a new loan
	@Test
	@Order(1)
	@Rollback(false)
	void performCrudOperations() {
		LoanDetails loan = new LoanDetails();
		loan.setFirstName("david");
		loan.setLastName("perez-test");
		loan.setLoanAmount(1000);
		loan.setPaymentAmount(125);
		loan.setPeriods(10);
		loan.setStatus("Active");
		
		repo.save(loan);
		
		Assertions.assertThat(loan.get_id()).isGreaterThan(0);
		System.out.println(loan.get_id());
		
	}
	
	@Test
	@Order(2)
	public void getLoanByLastNameTest() {
		LoanDetails loan = repo.findLoanDetailByLastName("perez-test");
		Assertions.assertThat(loan.getFirstName()).isEqualTo("david");
	}
	
	@Test
	@Order(3)
	public void updateLoanDetails() {
		LoanDetails loan = repo.findLoanDetailByLastName("perez-test");
		System.out.println(loan.getFirstName());
		loan.setFirstName("John Holliday");
		LoanDetails updatedLoan = repo.save(loan);
		Assertions.assertThat(updatedLoan.getFirstName()).isEqualTo("John Holliday");
		System.out.println(loan.getFirstName());
		
	}
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteLoan() {
	LoanDetails loan = repo.findLoanDetailByLastName("perez-test");
	repo.delete(loan);
	Assertions.assertThat(loan).isNull();
		
		
		
	}

}
