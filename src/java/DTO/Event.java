/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;





/**
 *
 * @author SE150886 Phan Hong Long
 */
public class Event {

    private int idEvent;
    private int title;
    private String major;
    private String location;
    private int numOfTeacher;
    private int numOfStudent;
    private String capacity;
    private int numOfCompany;
    private int idStatus;
    private String image;
    private Date startTime;
    private Date endTime;
    private int idCompany;
    private int idGroup;
    private int numOfCollaborator;
    private int currentCollaborator;

    public Event() {
    }

    public Event(int idEvent, int title, String major, String location, int numOfTeacher, int numOfStudent, String capacity, int numOfCompany, int idStatus, String image, Date startTime, Date endTime, int idCompany, int idGroup, int numOfCollaborator, int currentCollaborator) {
        this.idEvent = idEvent;
        this.title = title;
        this.major = major;
        this.location = location;
        this.numOfTeacher = numOfTeacher;
        this.numOfStudent = numOfStudent;
        this.capacity = capacity;
        this.numOfCompany = numOfCompany;
        this.idStatus = idStatus;
        this.image = image;
        this.startTime = startTime;
        this.endTime = endTime;
        this.idCompany = idCompany;
        this.idGroup = idGroup;
        this.numOfCollaborator = numOfCollaborator;
        this.currentCollaborator = currentCollaborator;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfTeacher() {
        return numOfTeacher;
    }

    public void setNumOfTeacher(int numOfTeacher) {
        this.numOfTeacher = numOfTeacher;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getNumOfCompany() {
        return numOfCompany;
    }

    public void setNumOfCompany(int numOfCompany) {
        this.numOfCompany = numOfCompany;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getNumOfCollaborator() {
        return numOfCollaborator;
    }

    public void setNumOfCollaborator(int numOfCollaborator) {
        this.numOfCollaborator = numOfCollaborator;
    }

    public int getCurrentCollaborator() {
        return currentCollaborator;
    }

    public void setCurrentCollaborator(int currentCollaborator) {
        this.currentCollaborator = currentCollaborator;
    }
    
}
