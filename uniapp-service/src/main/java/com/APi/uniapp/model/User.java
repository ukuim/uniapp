package com.APi.uniapp.model;

import com.APi.uniapp.until.Sha256;

import java.util.Date;

import static com.APi.uniapp.until.Sha256.sha256;

public class User {
    Sha256 sha256 = new Sha256();
    private String id;
    private String UserName;
    private String Password;
    private String Phone;
    private String data;
    private String order;
    private String session_key;
    private String openid;
    private Date Creatdate;
    private Date NewLogindate;

    public User(String id, String userName, String password, String phone, String data, String order, String session_key, String openid, Date creatdate, Date newLogindate) {
        this.id = id;
        UserName = userName;
        Password = password;
        Phone = phone;
        this.data = data;
        this.order = order;
        this.session_key = session_key;
        this.openid = openid;
        Creatdate = creatdate;
        NewLogindate = newLogindate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Phone='" + Phone + '\'' +
                ", data='" + data + '\'' +
                ", order='" + order + '\'' +
                ", session_key='" + session_key + '\'' +
                ", openid='" + openid + '\'' +
                ", Creatdate=" + Creatdate +
                ", NewLogindate=" + NewLogindate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getCreatdate() {
        return Creatdate;
    }

    public void setCreatdate(Date creatdate) {
        Creatdate = creatdate;
    }

    public Date getNewLogindate() {
        return NewLogindate;
    }

    public void setNewLogindate(Date newLogindate) {
        NewLogindate = newLogindate;
    }
}
