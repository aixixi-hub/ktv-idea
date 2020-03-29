package com.ktv.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * ktv_linkman
 * @author 
 */
@Data
public class Linkman implements Serializable {
    private Long lkmId;

    private Long singerId;

    private Long songerId;

    private static final long serialVersionUID = 1L;
}