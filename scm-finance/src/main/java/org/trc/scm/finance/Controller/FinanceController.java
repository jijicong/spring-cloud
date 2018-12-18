package org.trc.scm.finance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.finance.biz.FinanceBiz;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:47
 * @Description:  验证测试用demo
 */
@RestController
@RequestMapping("financeManager")
public class FinanceController {

    @Autowired
    private FinanceBiz financeBiz;

    @GetMapping("/getCountBySkuDemo/{skuCode}")
    public String getCountBySkuDemo(@PathVariable  String skuCode){
       String ss = financeBiz.getCountBySkuDemo(skuCode);
        return ss;

    }



}
