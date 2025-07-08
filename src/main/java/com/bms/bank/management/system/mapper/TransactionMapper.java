package com.bms.bank.management.system.mapper;

import com.bms.bank.management.system.entity.Account;
import com.bms.bank.management.system.entity.Transaction;
import com.bms.bank.management.system.entity.TransactionType;
import com.bms.bank.management.system.model.transaction.TransactionResponseModel;

public interface TransactionMapper {
    Transaction toEntity(double amount, Account account, TransactionType type);
    TransactionResponseModel toResponseModel(Long id, double amount, double balance);
}
