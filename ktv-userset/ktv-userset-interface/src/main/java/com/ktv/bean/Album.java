package com.ktv.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ktv_album
 * @author 
 */
@Data
public class Album implements Serializable {
    private Long albunId;

    private String albumName;

    private String albumMajor;

    private Date albumPublishtime;

    private String albumUrl;

    private static final long serialVersionUID = 1L;
}