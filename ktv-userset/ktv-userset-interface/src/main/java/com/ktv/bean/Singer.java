package com.ktv.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * ktv_singer
 * @author 
 */
@Data
public class Singer implements Serializable {
    private Long singerId;

    private String singerName;

    private String singerGender;

    private String singerCategory;

    private String singerUrl;

    private static final long serialVersionUID = 1L;
}