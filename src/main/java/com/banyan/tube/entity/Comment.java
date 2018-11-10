package com.banyan.tube.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer id;

    private Date createTime;

    private Integer owner;

    private Date updateTime;

    private Integer parentId;

    private Integer videoId;

    private String content;

    private Integer up;

    private Integer down;

    private Integer reward;

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

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }
}