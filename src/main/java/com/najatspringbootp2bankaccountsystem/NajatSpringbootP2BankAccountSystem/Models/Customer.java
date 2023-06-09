package com.najatspringbootp2bankaccountsystem.NajatSpringbootP2BankAccountSystem.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="customer_name")
    private String name;
    private Integer phoneNumber;
    private String email;

    /* i commented all OneToMany relationships because already there is ManyToOne relationship and, because
     it shows error and i can not Retrieve the account balance for a specific account. with it.
     */


 /*   @OneToMany(mappedBy = "customer") //one customer, many loans
    private List<Loan> loans;
    @OneToMany(mappedBy = "customer")
    private List<CreditCard> creditCard; //one customer, many creditcards
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts; //one customer, many accounts

  */







/*  Another way solution:
   @OneToMany(mappedBy = "customer") //one customer, many accounts
    private List<Account> accounts; */





}
