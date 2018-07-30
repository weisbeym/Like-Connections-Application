package edu.uc.likeconnectionsapplication.services;

import edu.uc.likeconnectionsapplication.dto.User;

public class SearchServiceStub implements ISearchService {

     /**
     * @param searchTerm the name of user being searched for or an interst
     * @return the user object the userName is associated with or the users that have that interest
     * @throws Exception if there in an error or the user does not exist.
     */
    public User SearchForUser(String searchTerm) throws Exception{
        return null;
    }

}
