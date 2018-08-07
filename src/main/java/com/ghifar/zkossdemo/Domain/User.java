package com.ghifar.zkossdemo.Domain;

import java.util.Date;

public class User {

    private Integer id;
    private String username;
    private String gender;
    private Date birthday;
    private String preview;

    public User(Integer id, String username, String gender, String preview) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.preview = preview;
    }

    public User() {
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
