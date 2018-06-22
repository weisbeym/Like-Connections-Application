package edu.uc.likeconnectionsapplication.dto;

/**
 *  A simple DTO that models a user.
 *  has the fields of userName, password, userID,
 *  emailAddress, and an array  of interests, to represent the user account.
 */

public class User {

    private String userName;
    private String password;
    private int userID;
    private String emailAddress;
    private String[] interests;

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

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }
}
