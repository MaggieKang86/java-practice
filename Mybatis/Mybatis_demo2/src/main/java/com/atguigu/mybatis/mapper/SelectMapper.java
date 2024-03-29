package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    // 根據 id 查詢用戶訊息
    User getUserById(@Param("id")Integer id);

    // 查詢所有的用戶訊息
    List<User> getAllUser();

    // 查詢用戶訊息的總紀錄數
    Integer getCount();

    // 根據 id 查詢用戶訊息為一個 map 集合
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    // 查詢所有用戶訊息為 map 集合
    // List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
