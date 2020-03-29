package com.ktv.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * ktv_collectiom
 * @author 
 */
@Data
public class Collectiom implements Serializable {
    private Long colId;

    private Long kehuId;

    private Long songId;

    private static final long serialVersionUID = 1L;
}