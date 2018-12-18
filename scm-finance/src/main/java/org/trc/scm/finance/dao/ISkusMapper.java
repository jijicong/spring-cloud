package org.trc.scm.finance.dao;

import org.apache.ibatis.annotations.Param;
import org.trc.scm.core.mybatis.BaseMapper;
import org.trc.scm.finance.entity.Skus;
import java.util.List;
import java.util.Map;
import java.util.Set;


public interface ISkusMapper extends BaseMapper<Skus> {

    Integer updateSkus(List<Skus> skusList) throws Exception;

    List<Skus> selectSkuList(Map<String, Object> map);

    Integer selectSkuListCount(Map<String, Object> map);

    List<String> selectAllBarCode(@Param("notInList") List<String> notInList);

    Set<String> selectSkuListByBarCode(@Param("barCodeList") List<String> barCodeList);

    List<Skus> getSkusExtBySkuCodes(@Param("skuCodes") Set<String> skuCodes);

    List<Skus> getskuInfosBySkuCodes(@Param("skuCodes") Set<String> skuCodes, @Param("skuName") String skuName, @Param("brandName") String brandName);

    List<Skus> getskuInfosBySkuCodesAndValid(@Param("skuCodes") Set<String> skuCodes, @Param("skuName") String skuName, @Param("brandName") String brandName);

}
