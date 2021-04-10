package com.cyj.guang_dian_ren.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-03-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Enterprise implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "enterprise_id", type = IdType.AUTO)
    private Integer enterpriseId;

    private String name;

    private String image;

    private String link;

    private String info;


}
