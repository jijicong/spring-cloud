package org.trc.scm.provider.purchase.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.trc.scm.provider.purchase.remote.PurchaseRemote;

/**
 * Created by hzcyn on 2018/12/18.
 */
@Component
public class PurchaseHystrix implements PurchaseRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "error";
    }
}
