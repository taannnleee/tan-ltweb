package com.letan.form;
import com.letan.model.User;
public class SurveyForm {
    private User user;
    private String wayPeopleKnow;
    private String isReceiveNotification;
    private String contactType;

    public SurveyForm() {}

    public SurveyForm(User user, String wayPeopleKnow, String isReceiveNotification, String contactType) {
        this.user = user;
        this.wayPeopleKnow = wayPeopleKnow;
        this.isReceiveNotification = isReceiveNotification;
        this.contactType = contactType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getWayPeopleKnow() {
        return wayPeopleKnow;
    }

    public void setWayPeopleKnow(String wayPeopleKnow) {
        this.wayPeopleKnow = wayPeopleKnow;
    }

    public String getIsReceiveNotification() {
        return isReceiveNotification;
    }

    public void setIsReceiveNotification(String isReceiveNotification) {
        this.isReceiveNotification = isReceiveNotification;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}

