package org.trc.scm.finance.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.finance.biz.FinanceBiz;
import org.trc.scm.finance.service.FinanceService;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:51
 * @Description:  业务层
 */
@Service
public class FinanceBizImpl  implements FinanceBiz {

    @Autowired
    private FinanceService financeService;

    @Override
    public Long getCountBySkuDemo(String skuCode) {
        return financeService.getCountBySkuDemo(skuCode);
    }
}
