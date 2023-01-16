package com.loan.ledger.Model;

import java.util.List;

import javax.persistence.OneToMany;

public class Customer {
     private Integer Id;
     private String name;
     private String loanstartdate;
     private Double loanamt;
     private Integer TenorPeriod;
     @OneToMany
     private List<Ledger>  ledger;
}
