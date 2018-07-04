package edu.uc.likeconnectionsapplication.dto;

import java.util.Set;

/**
 *  A simple DTO that models a user.
 *  has the fields of userName, password, userID,
 *  emailAddress, and an HashSet of interests objects, to represent the user account.
 */

public class User {

    private String userName;
    private String password;
    private int userID;
    private String emailAddress;
    private Set<Interest> interests;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Set<Interest> getInterests() {
        return interests;
    }

    public void setInterests(Interest interest) {
        interests.add(interest);
    }
}
