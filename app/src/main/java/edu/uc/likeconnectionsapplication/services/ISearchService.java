package edu.uc.likeconnectionsapplication.services;

import edu.uc.likeconnectionsapplication.dto.User;

/**
 * search functionality for app
 * allows for users to search  based on interest object fields
 */

public interface ISearchService {

    /**
     * @param userName the name of user being searched for
     * @return the user object the userName is associated with
     * @throws Exception if there in an error or the user does not exist.
     */
    public User getUserByUserName(String userName) throws Exception;

    /**
     * @param interest a string representing a specific interest or a field in one.
     * Example: can search for football or sports(a category, see the javadoc in the Interest dto)
     * @return users with that interest in their HashSet
     * @throws Exception when there is no such interest, no users with that interest, or an error occurs.
     */
    public User getUserByInterest(String interest) throws Exception;
}
