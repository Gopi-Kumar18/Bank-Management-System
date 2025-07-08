package com.bms.bank.management.system.service;

import com.bms.bank.management.system.model.account.AccountResponseModel;

import java.util.List;

public interface AccountService {
    AccountResponseModel createNewAccount();

    List<AccountResponseModel> getMyAccounts();
}
