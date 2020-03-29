package com.ktv.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ktv_user
 * @author 
 */
@Data
public class User implements Serializable {
    private Long userId;

    private String userName;

    private String userPwd;

    private Long level;

    private String phone;

    private Date creattime;

    private static final long serialVersionUID = 1L;
}