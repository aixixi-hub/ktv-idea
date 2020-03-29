package com.ktv.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ktv_kehu
 * @author 
 */
@Data
public class Kehu implements Serializable {
    private Long kehuId;

    private String kehuName;

    private Long kehuLevel;

    private String kehuAddress;

    private String kehuPhone;

    private Date kehuCreattime;

    private static final long serialVersionUID = 1L;
}