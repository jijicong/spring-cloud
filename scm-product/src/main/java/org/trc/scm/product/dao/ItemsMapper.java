package org.trc.scm.product.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.trc.scm.common.support.BaseMapper;
import org.trc.scm.product.model.domain.Items;

@Repository
public interface ItemsMapper extends BaseMapper<Items> {

    /**
     * @Description: 根据spucode 查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    public Items getItemBySpuCode(@Param("spuCode")  String spuCode);
}