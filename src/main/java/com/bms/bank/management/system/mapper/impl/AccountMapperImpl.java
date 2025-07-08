package com.bms.bank.management.system.mapper.impl;

import com.bms.bank.management.system.entity.Account;
import com.bms.bank.management.system.mapper.AccountMapper;
import com.bms.bank.management.system.model.account.AccountResponseModel;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {
    @Override
    public AccountResponseModel toResponseModel(Account account) {
        return AccountResponseModel
                .builder()
                .card_number(account.getCardNumber())
                .cvv(account.getCvv())
                .balance(account.getBalance())
                .build();
    }
}