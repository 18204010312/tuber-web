package com.banyan.tube.entity;

import java.io.Serializable;
import java.util.Date;

public class Video implements Serializable {
    private Integer id;

    private Integer owner;

    private Date createTime;

    private Date updateTime;

    private Integer statue;

    private String title;

    private Integer views;

    private String tags;

    private String links;

    private Integer up;

    private Integer down;

    private Integer reward;

    private Integer duration;

    private String description;

    private Byte accredit;

    private Integer type;

    private String cover;

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

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getAccredit() {
        return accredit;
    }

    public void setAccredit(Byte accredit) {
        this.accredit = accredit;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}