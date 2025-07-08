package com.bms.bank.management.system.mapper;

import com.bms.bank.management.system.entity.User;
import com.bms.bank.management.system.model.authentication.RegisterRequestModel;

public interface UserMapper {
    User toUser(RegisterRequestModel request);
}
