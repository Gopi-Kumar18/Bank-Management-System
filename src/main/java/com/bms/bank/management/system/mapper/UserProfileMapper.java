package com.bms.bank.management.system.mapper;

import com.bms.bank.management.system.entity.User;
import com.bms.bank.management.system.model.authentication.UserProfileResponseModel;

public interface UserProfileMapper {
    UserProfileResponseModel toUserProfile(User user);
}
