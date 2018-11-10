package com.banyan.tube.entity;

import java.io.Serializable;
import java.util.Date;

public class TokenHistory implements Serializable {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer owner;

    private Integer statue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }
}