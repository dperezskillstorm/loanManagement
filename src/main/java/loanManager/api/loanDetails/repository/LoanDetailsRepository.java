package loanManager.api.loanDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import loanManager.api.loanDetails.models.LoanDetails;

@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Long> {
	

}
