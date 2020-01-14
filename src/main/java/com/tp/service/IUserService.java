package com.tp.service;

import com.tp.models.entity.User;

/**
 * FileName: IUserService
 * Author:   TP
 * Date:     2020-01-10 14:09
 * Description:用户服务
 */
public interface IUserService {

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

    String getEnv();
}
