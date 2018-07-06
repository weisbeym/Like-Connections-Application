package edu.uc.likeconnectionsapplication.services;

import edu.uc.likeconnectionsapplication.dto.User;

public class SearchServiceStub implements ISearchService {

    /**
     * @param userName the name of user being searched for
     * @return the user object the userName is associated with
     * @throws Exception if there in an error or the user does not exist.
     */
    @Override
    public User getUserByUserName(String userName) throws Exception {
        return null;
    }

    /**
     * @param interest a string representing a specific interest or a field in one.
     * Example: can search for football or sports(a category, see the javadoc in the Interest dto)
     * @return users with that interest in their HashSet
     * @throws Exception when there is no such interest, no users with that interest, or an error occurs.
     */
    @Override
    public User getUserByInterest(String interest) throws Exception {
        return null;
    }
}
