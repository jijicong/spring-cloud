package org.trc.scm.finance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.core.support.BaseService;
import org.trc.scm.finance.dao.ISkusMapper;
import org.trc.scm.finance.domain.Skus;
import org.trc.scm.finance.service.FinanceService;
import tk.mybatis.mapper.entity.Example;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/18 09:53
 * @Description: 核心业务层， 可以抽离的公共业务
 */
@Service
public class FinanceServiceImpl extends BaseService<Skus,Long> implements FinanceService {

    @Autowired
    private ISkusMapper iskusMapper;

    @Override
    public Long getCountBySkuDemo(String skuCode) {
        Example example = new Example(Skus.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("skuCode",skuCode);
        return (long)iskusMapper.selectCountByExample(example);
    }
}
