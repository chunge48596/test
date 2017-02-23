package com.alibaba.entity;

import java.math.BigDecimal;
import java.util.Date;

public class industry {
    private Long id;

    private Short categoryLevel;

    private Long parentId;

    private String categoryName;

    private String categoryExplain;

    private BigDecimal profitMargin;

    private Date createDate;

    private Date updateDate;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Short categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryExplain() {
        return categoryExplain;
    }

    public void setCategoryExplain(String categoryExplain) {
        this.categoryExplain = categoryExplain == null ? null : categoryExplain.trim();
    }

    public BigDecimal getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(BigDecimal profitMargin) {
        this.profitMargin = profitMargin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}