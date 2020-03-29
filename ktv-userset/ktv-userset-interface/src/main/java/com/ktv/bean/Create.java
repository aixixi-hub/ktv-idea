package com.ktv.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * ktv_create
 * @author 
 */
@Data
public class Create implements Serializable {
    private Long crtId;

    private Long singerId;

    private Long albumId;

    private static final long serialVersionUID = 1L;
}