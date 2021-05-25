package com.szh.springboot.mapper;

import com.szh.springboot.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User selectUserByName(@Param("username") String username);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAllUser();

    /**
     * 新增用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    int deleteUser(@Param("userId") Integer userId);
}
