package org.trc.scm.common.support;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


/**
 * @author hzszy
 */
public class AclWmsUserAccreditInfo<T> implements Serializable {

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    @ApiModelProperty(value = "主键ID", hidden=true)
    private Long id;


    @ApiModelProperty(value = "用户中心注册的UserId", hidden=true)
    private String userId;

    @ApiModelProperty(value = "用户手机号", hidden=true)
    private String phone;

    @ApiModelProperty(value = "用户名称", hidden=true)
    @NotEmpty(message = "用户名称不能为空!")
    private String name;


     
    @ApiModelProperty(value = "用户备注信息", hidden=true)
    private String remark;


     
    @ApiModelProperty(value = "是否有效:0-无效,1-有效", hidden=true)
    private String isValid;

     
    @ApiModelProperty(value = "创建人", hidden=true)
    private String createOperator;


    @ApiModelProperty(value = "创建时间", hidden=true)
    private LocalDateTime createTime;


    @ApiModelProperty(value = "更新时间", hidden=true)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "是否删除:0-否,1-是", hidden=true)
    private String isDeleted;

    @TableField(exist = false)
    private String warehouseCode;
    @TableField(exist = false)
    private String resourceCode;
    @TableField(exist = false)
    private String resourceName;
    @TableField(exist = false)
    private String warehouseName;
    @TableField(exist = false)
    private List<T> wmsResourceList;
    @TableField(exist = false)
    private List<T> warehouseInfoList;


    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public List<T> getWmsResourceList() {
        return wmsResourceList;
    }

    public void setWmsResourceList(List<T> wmsResourceList) {
        this.wmsResourceList = wmsResourceList;
    }

    public List<T> getWarehouseInfoList() {
        return warehouseInfoList;
    }

    public void setWarehouseInfoList(List<T> warehouseInfoList) {
        this.warehouseInfoList = warehouseInfoList;
    }
}
