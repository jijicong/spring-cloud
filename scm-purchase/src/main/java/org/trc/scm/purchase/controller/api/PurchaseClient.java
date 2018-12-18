package org.trc.scm.purchase.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.provider.purchase.remote.PurchaseRemote;

/**
 * Created by hzcyn on 2018/12/18.
 */
@Slf4j
@RestController
public class PurchaseClient implements PurchaseRemote {

    @Value("${mybatis.type-aliases-package}")
    private String mybatis;

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return name + mybatis;
    }
}
