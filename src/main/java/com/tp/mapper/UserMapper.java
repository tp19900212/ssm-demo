package com.tp.mapper;

import com.tp.models.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 根据ID获取用户
     *
     * @param id 主键ID
     * @return 用户信息
     */
    User getById(Integer id);

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 影响的行数
     */
    int saveUser(User user);
}
