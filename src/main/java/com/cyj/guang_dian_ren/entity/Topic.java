package com.cyj.guang_dian_ren.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer topicId;

    private String title;

    private String username;

    private String date;

    public Topic(Integer topicId, String title, String username, String date) {
        this.topicId=topicId;
        this.title=title;
        this.username=username;
        this.date=date;
    }

    public Topic(){}
}
