package com.cyj.guang_dian_ren.entity;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Answer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer answerId;

    private String content;

    private String username;

    private Integer topicId;

    private String date;

    public Answer(Integer answerId, String content, String username,Integer topicId,String date){
        this.answerId=answerId;
        this.content=content;
        this.username=username;
        this.topicId=topicId;
        this.date=date;
    }

    public Answer(){}
}
