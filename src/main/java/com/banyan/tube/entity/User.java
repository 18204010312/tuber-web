package com.banyan.tube.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;

    private Integer owner;

    private Date createTime;

    private Date updateTime;

    private String name;

    private String mail;

    private Integer followerCount;

    private Integer subscribed;

    private Integer videoCount;

    private Integer tube;

    private Integer statue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public Integer getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Integer subscribed) {
        this.subscribed = subscribed;
    }

    public Integer getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    public Integer getTube() {
        return tube;
    }

    public void setTube(Integer tube) {
        this.tube = tube;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }
}