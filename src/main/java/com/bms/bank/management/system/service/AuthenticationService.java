package com.bms.bank.management.system.service;

import com.bms.bank.management.system.model.authentication.AuthenticationResponseModel;
import com.bms.bank.management.system.model.authentication.RegisterRequestModel;
import com.bms.bank.management.system.model.authentication.LoginRequestModel;

public interface AuthenticationService {
    public AuthenticationResponseModel register(RegisterRequestModel request);

    public AuthenticationResponseModel login(LoginRequestModel request);
}
