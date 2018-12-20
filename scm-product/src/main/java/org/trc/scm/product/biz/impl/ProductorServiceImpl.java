package org.trc.scm.product.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.common.support.BaseService;
import org.trc.scm.product.core.ProductCore;
import org.trc.scm.product.model.domain.Items;
import org.trc.scm.product.biz.ProductorService;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 15:46
 * @Description:
 */
@Service
public class ProductorServiceImpl implements ProductorService {


    @Autowired
    private ProductCore productCore;

    /**
     * @Description: 根据spucode查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    @Override
    public Items getItemBySpuCode(String spuCode) {
//        Items items = new Items();
//        items.setSpuCode(spuCode);
//        return this.selectOne(items);

        //通过公共层调用
        return productCore.getItemBySpuCode(spuCode);

    }
}
