package org.trc.scm.provider.purchase.remote;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by hzcyn on 2018/12/18.
 */
@FeignClient(name= "purchase")
public interface PurchaseRemote {


}
