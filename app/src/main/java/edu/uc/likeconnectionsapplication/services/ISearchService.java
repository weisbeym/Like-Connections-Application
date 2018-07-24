package edu.uc.likeconnectionsapplication.services;

import edu.uc.likeconnectionsapplication.dto.User;

/**
 * search functionality for app
 * allows for users to search  based on interest object fields
 */

public interface ISearchService {

    /**
     * @param searchTerm the name of user being searched for or an interst
     * @return the user object the userName is associated with or the users that have that interest
     * @throws Exception if there in an error or the user does not exist.
     */
    public User getUser(String searchTerm) throws Exception;

}
