/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author SE150886 Phan Hong Long
 */
public class Company {
    private int idCompany;
    
    private String name;
    private String address;
    private String major;
    private String website;
    private String phone;
    private int status;
    private int idLogin;

    public Company() {
    }

    public Company(int idCompany, String name, String address, String major, String website, String phone, int status, int idLogin) {
        this.idCompany = idCompany;
        this.name = name;
        this.address = address;
        this.major = major;
        this.website = website;
        this.phone = phone;
        this.status = status;
        this.idLogin = idLogin;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    
    
}
