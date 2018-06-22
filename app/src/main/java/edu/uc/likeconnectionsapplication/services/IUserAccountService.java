package edu.uc.likeconnectionsapplication.services;

import edu.uc.likeconnectionsapplication.dto.User;

public interface IUserAccountService {
    /**
     * Attempt to logon the user with the given username and password.
     * @param username the user's username.
     * @param password the user's password.
     * @return true if username and password match a user, false if not.
     */
    public boolean login(String username, String password) throws Exception;

    /**
     * Save the given user.
     * @param user A user object representing a user to save.
     * @throws Exception Any error in the underlying persistence mechanism.
     */
    public void save (User user) throws Exception;

    /**
     * Retrieve the given user.
     *
     * @param username the username that belongs to the user to retrieve.
     * @return the user retrieved
     * @throws Exception if the user does not exist, or if there is an underlying error in the persistence mechanism.
     */
    public User getUser (String username) throws Exception;

    /**
     *
     * @param userName the chosen userName for the new user.
     * @param password the chosen password for the new user.
     * @param emailAddress the new users email address.
     * @throws Exception if userName, password, or emailAddress are associated with another user.
     */
    public boolean register(String userName, String password, String emailAddress) throws Exception;
}
