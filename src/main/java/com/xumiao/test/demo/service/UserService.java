package com.xumiao.test.demo.service;

import com.xumiao.test.demo.model.User;

import java.util.List;

public interface UserService {

   User select(int uid);
   int insert(User u);
   int countByGroupId(int gid);
    List<User> selectByGroupId(int gid);
}
