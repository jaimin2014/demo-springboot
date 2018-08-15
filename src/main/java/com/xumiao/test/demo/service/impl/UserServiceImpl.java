package com.xumiao.test.demo.service.impl;

import com.xumiao.test.demo.dao.UserMapper;
import com.xumiao.test.demo.model.User;
import com.xumiao.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper um;

    @Override
    public User select(int uid) {
        User u = um.selectByPrimaryKey(uid);
        return u;
    }

    @Override
    public int insert(User u) {
        return 0;
    }

    @Override
    public int countByGroupId(int gid) {

        return 0;
    }
    @Override
    public List<User> selectByGroupId(int gid){
        List<User> lu = um.selectByGroupId(gid);
        return lu;
    }
}
