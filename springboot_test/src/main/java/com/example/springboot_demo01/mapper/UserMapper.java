package com.example.springboot_demo01.mapper;

import com.example.springboot_demo01.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {


    public List<String> queryUserList();

    public List<String> queryUserListLike(String username);

    public List<User> queryUserListOne();

    public List<Map<String,Object>> queryUserListSecond();

    List<Map<String,Object>> queryUserListThird(Map<String,Object> paramMap);


    void insertUserFour(Map<String, Object> paramMap);

    void updateUserFour(Long id);

    void updateUserSex(Long id);

    List<Map<String,Object>> queryUserMap();

    public List<Map<String,Object>> queryOracleUserList();

    List<Map<String,Object>> queryUserForResultMap();
}
