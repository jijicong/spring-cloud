package org.trc.scm.finance.biz;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:51
 * @Description:
 */
public interface FinanceBiz {


    public Long getCountBySkuDemo(@PathVariable String skuCode);

}
