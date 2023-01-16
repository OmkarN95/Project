package com.loan.ledger.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.ledger.Model.Customer;

public interface LedgerRepository extends JpaRepository<Customer, Integer>{

}
