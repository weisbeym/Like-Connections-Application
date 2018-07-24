package edu.uc.likeconnectionsapplication.dto;

<<<<<<< HEAD
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

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

    // Getters and setters are ignored for brevity,
    // but they're required for Room to work.
=======
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
>>>>>>> f4b6ef42d12c2efd5f3abe3409a989cdb59a8b74
}
