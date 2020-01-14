package com.tp.models.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * FileName: Account
 * Author:   TP
 * Date:     2020-01-12 03:04
 * Description: 账户信息实体类
 */
@Data
@ToString(callSuper = true)
public class Account extends BaseEntity {
    private static final long serialVersionUID = 3782100719413637295L;

    private String name;

    private BigDecimal money;
}