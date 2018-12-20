package org.trc.scm.common.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.trc.scm.common.support.AclWmsUserAccreditInfo;

/**
 * Created by hzcyn on 2018/5/29.
 */
public class AclWmsUserAccreditInfoUtil {

    public static AclWmsUserAccreditInfo getAclWmsUserAccreditInfo(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        AclWmsUserAccreditInfo accreditInfo = (AclWmsUserAccreditInfo) requestAttributes.getRequest().getAttribute(SupplyConstants.Authorization.ACL_USER_ACCREDIT_INFO);
        return accreditInfo;
    }

}
