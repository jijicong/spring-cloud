package org.trc.scm.product.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.product.model.domain.Items;


/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 14:35
 * @Description: 商品管理（服务之间调用接口管理）
 */

@RestController
public class ProductApi {


   @GetMapping("/getItemBySpuCode")
   public Items getItemBySpuCode(String spuCode){
       return  new Items();
   }


}
