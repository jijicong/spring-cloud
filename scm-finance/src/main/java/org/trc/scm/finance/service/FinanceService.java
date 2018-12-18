package org.trc.scm.finance.service;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:52
 * @Description:  核心业务层， 可以抽离的公共业务 (在没有公共业务的时候 或 公共查询功能的时候 可以不需要这一层)
 */
public interface FinanceService  {


    public String getCountBySkuDemo(String skuCode);



}
