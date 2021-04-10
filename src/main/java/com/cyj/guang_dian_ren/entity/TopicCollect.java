package com.cyj.guang_dian_ren.entity;

import java.io.Serializable;
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
public class TopicCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer topicId;

    private String username;

    public TopicCollect(Integer topicId, String username) {
        this.username=username;
        this.topicId=topicId;
    }


}
