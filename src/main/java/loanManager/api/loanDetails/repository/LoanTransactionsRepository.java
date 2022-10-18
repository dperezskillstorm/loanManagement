package loanManager.api.loanDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import loanManager.api.loanDetails.models.LoanTransactions;

@Repository
public interface LoanTransactionsRepository extends JpaRepository<LoanTransactions, Long> {

}
