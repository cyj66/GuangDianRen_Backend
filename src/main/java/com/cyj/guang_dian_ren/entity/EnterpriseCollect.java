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
public class EnterpriseCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer enterpriseId;

    private String username;


    public EnterpriseCollect( Integer enterpriseId,String username) {
        this.username=username;
        this.enterpriseId=enterpriseId;
    }
}
