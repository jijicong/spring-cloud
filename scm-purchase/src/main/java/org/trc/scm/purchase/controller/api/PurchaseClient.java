package org.trc.scm.purchase.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.provider.purchase.remote.PurchaseRemote;

/**
 * Created by hzcyn on 2018/12/18.
 */
@Slf4j
@RestController
public class PurchaseClient implements PurchaseRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello";
    }
}
