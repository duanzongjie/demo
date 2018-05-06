package com.example.demo.model;

import javax.xml.crypto.Data;

public class User {

    private int user_id;

    private String user_name;

    private String login_name;

    private String password;

    private int status;

    private Data create_date;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Data getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Data create_date) {
        this.create_date = create_date;
    }
}
