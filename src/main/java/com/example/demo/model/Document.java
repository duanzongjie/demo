package com.example.demo.model;

import javax.xml.crypto.Data;
import java.security.SecureRandom;

public class Document {

    private  int document_id;

    private  String title;

    private String file_name;

    private String user_id;

    private Data create_date;

    private String remarks;

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Data getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Data create_date) {
        this.create_date = create_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
