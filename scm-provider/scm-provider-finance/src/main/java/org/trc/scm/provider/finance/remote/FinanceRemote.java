package org.trc.scm.provider.finance.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 11:51
 * @Description: Finance 调用采购中心的业务的feign
 */
@FeignClient(name = "purchase")
public interface FinanceRemote {

    @GetMapping("/hello/hello")
    public String getFromPurchase();


}
