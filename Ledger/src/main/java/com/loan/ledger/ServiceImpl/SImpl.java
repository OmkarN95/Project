package com.loan.ledger.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.ledger.Model.Customer;
import com.loan.ledger.Repo.LedgerRepository;
import com.loan.ledger.ServiceInt.SInt;
@Service
public class SImpl implements SInt  {
   
	@Autowired
	LedgerRepository lr;
	@Override
	public Customer saveCust(Customer c) {
		// TODO Auto-generated method stub
		return lr.save(c);
	}

}
