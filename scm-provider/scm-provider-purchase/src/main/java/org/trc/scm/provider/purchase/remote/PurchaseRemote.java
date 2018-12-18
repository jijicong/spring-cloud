package org.trc.scm.provider.purchase.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hzcyn on 2018/12/18.
 */
@FeignClient(name= "purchase")
public interface PurchaseRemote {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}