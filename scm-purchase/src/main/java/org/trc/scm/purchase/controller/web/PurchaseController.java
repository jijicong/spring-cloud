package org.trc.scm.purchase.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzcyn on 2018/12/14.
 */
@RestController
public class PurchaseController {

    @RequestMapping("/hello/hello")
    public String from() {
        return "hello";
    }
}
