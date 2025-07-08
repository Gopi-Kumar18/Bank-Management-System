package com.bms.bank.management.system.service;

import com.bms.bank.management.system.model.transaction.DepositRequestModel;
import com.bms.bank.management.system.model.transaction.TransactionResponseModel;
import com.bms.bank.management.system.model.transaction.WithdrawRequestModel;

public interface TransactionService {
    TransactionResponseModel deposit(DepositRequestModel request);
    TransactionResponseModel withdraw(WithdrawRequestModel request);
}