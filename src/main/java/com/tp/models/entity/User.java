package com.tp.models.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class User extends BaseEntity {
    private static final long serialVersionUID = 4214164189353864912L;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 性别（0：女 1：男）
     */
    private int sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
