package com.example.springboot_demo01.controller;

import com.example.springboot_demo01.domain.User;
import com.example.springboot_demo01.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MapperController {

    Logger logger = LoggerFactory.getLogger(MapperController.class);

    @Value("${user.userName}")
    private String userName;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<String> queryUser(){
        List<String> users = userMapper.queryUserList();
        return users;
    }


    @RequestMapping("/queryUser1")
    public List<User> queryUserOne(){
        List<User> users = userMapper.queryUserListOne();
        return users;
    }

    @RequestMapping("/queryUser2")
    public List<Map<String,Object>> queryUserSecond(){
        List<Map<String,Object>> users = userMapper.queryUserListSecond();
        return users;
    }

    @RequestMapping("/queryUser3")
    public List<Map<String,Object>> queryUserThird(){
        Map<String,Object> paramMap = new HashMap<>();
        //paramMap.put("username","姜兵峰");
        List<Map<String,Object>> users = userMapper.queryUserListThird(paramMap);
        return users;
    }

    @RequestMapping("/queryUser4")
    public void queryUserFour(){
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("username","jiangbingfeng");
        paramMap.put("birthday",new Date());
        paramMap.put("sex","男");
        paramMap.put("address","昌平");
         userMapper.insertUserFour(paramMap);
    }

    @RequestMapping("/queryUser5")
    public void queryUserFive(){
        Long id = 14L;
        userMapper.updateUserFour(id);
    }

    @RequestMapping("/queryUser6")
    public void queryUserSex(){
        Long id = 9L;
        userMapper.updateUserSex(id);
    }

    @RequestMapping("/queryUser7")
    public List<String> queryUserSeven(){

        List<String> users = userMapper.queryUserListLike("% or 1=1 or username like %j");
        return users;
    }

    @RequestMapping("/queryUser8")
    public List<Map<String,Object>> queryUserEight(){

        List<Map<String,Object>> users = userMapper.queryUserMap();
        return users;
    }

    @RequestMapping("/queryUser9")
    public List<Map<String,Object>> queryOracleUser(){
        List<Map<String,Object>> users = userMapper.queryOracleUserList();
        return users;
    }

    @RequestMapping("/queryUser10")
    public String queryValueName(){
        logger.info("测试=====================>");
        return userName;
    }

    @PostMapping(value = "/test")
    public String test(String input)
    {
        return new StringBuffer(input).reverse().toString();
    }


    @PostMapping(value = "/testUser")
    public User testUser(@RequestBody User user)
    {
        System.out.println(user.getUsername());
        User user1 = new User();
        user1.setId(2L);
        user1.setUsername("bfjaing");
        user1.setBirthday(new Date());
        user1.setSex("男");
        user1.setAddress("昌平");
        return user1;
    }

    @PostMapping(value = "/testMap")
    public Map testMap(@RequestBody Map map)
    {
        return map;
    }
}
