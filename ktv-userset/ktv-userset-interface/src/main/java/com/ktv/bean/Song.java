package com.ktv.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * ktv_song
 * @author 
 */
@Data
public class Song implements Serializable {
    private Long songId;

    private String songName;

    private Long albumId;

    private String songUrl;

    private static final long serialVersionUID = 1L;
}