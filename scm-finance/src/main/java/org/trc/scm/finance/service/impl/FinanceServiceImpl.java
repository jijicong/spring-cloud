package org.trc.scm.finance.service.impl;

import org.springframework.stereotype.Service;
import org.trc.scm.core.support.BaseService;
import org.trc.scm.finance.entity.Skus;
import org.trc.scm.finance.service.FinanceService;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:53
 * @Description: 核心业务层， 可以抽离的公共业务
 */
@Service
public class FinanceServiceImpl extends BaseService<Skus,Long> implements FinanceService {

    @Override
    public Long getCountBySkuDemo(String skuCode) {
        return null;
    }
}
