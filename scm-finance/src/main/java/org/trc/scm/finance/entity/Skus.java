package org.trc.scm.finance.entity;


import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.trc.scm.core.mybatis.BaseEntity;
import javax.persistence.*;


@Setter
@Getter
@Table(name = "Skus")
public class Skus extends BaseEntity {
    @ApiParam(value="主键")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ApiParam(value="skucode")
    @Column(name="skuCode")
    private String skuCode;
    @Column(name="itemId")
    private Long itemId;
    @Column(name="spuCode")
    private String spuCode;
    @Column(name="propertyValueId")
    @Length(max = 64, message = "属性值id长度不能超过64个")
    private String propertyValueId;
    @Column(name="propertyValue")
    @Length(max = 128, message = "属性值长度不能超过128个")
    private String propertyValue;
    @Column(name="barCode")
    @Length(max = 512, message = "条形码长度不能超过256个")
    private String barCode;
    @Column(name="marketPrice")
    private Long marketPrice;
    @Column(name="weight")
    private Long weight;
    @Column(name="predictChannelPrice")
    private Long predictChannelPrice;
    @Column(name="picture")
    @Length(max = 1024, message = "商品SKU图片长度不能超过1024个")
    private String picture;
    @Column(name="channel1PreSellPrices")
    private Long channel1PreSellPrices;
    @Column(name="channel2PreSellPrices")
    private Long channel2PreSellPrices;
    @Column(name="channel3PreSellPrices")
    private Long channel3PreSellPrices;
    @Column(name="channel4PreSellPrices")
    private Long channel4PreSellPrices;
    @Column(name="channel5PreSellPrices")
    private Long channel5PreSellPrices;
    @Column(name="channel6PreSellPrices")
    private Long channel6PreSellPrices;
    @Column(name="channel7PreSellPrices")
    private Long channel7PreSellPrices;
    @Column(name="isValid")
    private String isValid; //是否有效:0-否,1-是
    @Column(name="skuName")
    private String skuName;
    /**
     * sku规格信息
     */
    @Column(name="specInfo")
    private String specInfo;

}