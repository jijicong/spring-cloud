package org.trc.scm.purchase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzcyn on 2018/12/14.
 */
@RestController
public class PurchaseController {

    @Value("${name.chenyn}")
    private String name;

    @RequestMapping("/hello")
    public String from() {
        return this.name;
    }
}
