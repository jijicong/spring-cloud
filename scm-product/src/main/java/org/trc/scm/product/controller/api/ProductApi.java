package org.trc.scm.product.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.product.model.domain.Items;
import org.trc.scm.product.remote.PurchaseRemote;
import org.trc.scm.product.service.ProductorService;


/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 14:35
 * @Description: 商品管理（服务之间调用接口管理）
 */

@RestController
public class ProductApi {

    @Autowired
    private ProductorService productorService;

    @Autowired
    private PurchaseRemote purchaseRemote;

    /**
     * @Description: 根据spucode查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    @GetMapping("/getItemBySpuCode")
    public Items getItemBySpuCode(String spuCode){
        System.out.println("开始远程调用");
        purchaseRemote.test();
        System.out.println("结束远程调用");
       return  productorService.getItemBySpuCode(spuCode);
    }


}
