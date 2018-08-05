package com.dao;

import com.model.User;

public interface IUserDao {

    User selectUser(long id);

}