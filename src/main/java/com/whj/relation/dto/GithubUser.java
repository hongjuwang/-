package com.whj.relation.dto;

import javax.swing.*;

/**
 * @Author wanghj
 * @Description: com.whj.relation.dto
 * @Description TODO
 * @Date: 2019/9/18
 **/
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
