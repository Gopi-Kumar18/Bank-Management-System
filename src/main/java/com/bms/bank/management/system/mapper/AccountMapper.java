package com.bms.bank.management.system.mapper;

import com.bms.bank.management.system.entity.Account;
import com.bms.bank.management.system.model.account.AccountResponseModel;

public interface AccountMapper {
    AccountResponseModel toResponseModel(Account account);
}
