package com.bms.bank.management.system.repository;

import com.bms.bank.management.system.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
