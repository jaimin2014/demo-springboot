package com.xumiao.test.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.xumiao.test.demo.model.User;
import com.xumiao.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService usi;

    @RequestMapping(value = "user/selectUsersByGroupId" ,method = {RequestMethod.GET})
     public String selectUsersByGroupId(int gid)
     {
         List<User>  lu = usi.selectByGroupId(gid);
         return  JSONObject.toJSONString(lu);
     }
    @RequestMapping(value = "user/selectUserByUid" ,method = {RequestMethod.GET})
    public String selectUserByUid(int uid)
    {

        User u = usi.select(uid);
        return  JSONObject.toJSONString(u);
    }
}
