package org.trc.scm.product.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.product.core.ProductCore;
import org.trc.scm.product.dao.ItemsMapper;
import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 16:21
 * @Description: 核心层（服务功能的公共层）
 */
@Service
public class ProductCoreImpl  implements ProductCore {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items getItemBySpuCode(String spuCode) {
        return itemsMapper.getItemBySpuCode(spuCode);
    }


}
