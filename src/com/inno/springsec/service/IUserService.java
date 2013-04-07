package com.inno.springsec.service;

import com.inno.springsec.model.Users;

public interface IUserService {

	Users getUserByName(String username);

}
