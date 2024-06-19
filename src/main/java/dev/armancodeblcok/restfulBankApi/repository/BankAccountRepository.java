package dev.armancodeblcok.restfulBankApi.repository;

import dev.armancodeblcok.restfulBankApi.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
// interact with database
// perform CRUD(Create,Read,Update,Delete)
// Query Methods
// Pagination and Sorting
//Buy me coffee
public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
//sedan
//truck
//bus
// Explain Spring data jpa (it part of Sprig data project. It builds on top of JPA and Hibernate(or another Jpa implementation) to simplify the data access layer)
// jpa(Java Persistence API) =>JPA is a specification for object-relational-mapping (ORM):
 // it defines a set of concepts and API for managing data in java application.It does not provide
// an implementation
// Hibernate (Hibernate is an ORM framework that implements the JPA specification. HQL)
//
