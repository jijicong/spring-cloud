package org.trc.scm.common.controller.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.provider.purchase.remote.PurchaseRemote;

import javax.annotation.Resource;

/**
 * Created by hzcyn on 2018/12/18.
 */
@RestController
@Slf4j
public class CommonController {

    @Resource
    PurchaseRemote purchaseRemote;

    @RequestMapping("/hello")
    public String from() {
        return purchaseRemote.hello("name");
    }
}
