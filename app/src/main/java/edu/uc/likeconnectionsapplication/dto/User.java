package edu.uc.likeconnectionsapplication.dto;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/* Room DB as alternative
@Entity(tableName = "users")
public class User {
    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    public int getUid() {
        return uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUid( int uid ) {
        this.uid = uid;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }


=======

*/
import java.util.Set;

/**
 *  A simple DTO that models a user.
 *  has the fields of userName, password, userID,
 *  emailAddress, and an HashSet of interests objects, to represent the user account.
 */
@Entity
public class User {

    @ColumnInfo (name = "userName")
    private String userName;
    @ColumnInfo (name = "password")
    private String password;
    @PrimaryKey (autoGenerate = true)
    private int userID;
    @ColumnInfo (name = "emailAddress")
    private String emailAddress;
    @ColumnInfo (name = "interests")
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
