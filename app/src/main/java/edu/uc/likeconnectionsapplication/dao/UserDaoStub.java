package edu.uc.likeconnectionsapplication.dao;

import java.util.ArrayList;
import java.util.List;

import edu.uc.likeconnectionsapplication.dto.User;

public class UserDaoStub implements UserDao {

    /**
     * returns users as a List
     * @return all stored users
     */
    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        //test users
        //1st
        User user1 = new User();
        user1.setUserName("billy@bob");
        user1.setEmailAddress("bb@gmail.com");
        user1.setUserID(1);
        user1.setPassword("12345");
        //2nd
        User user2 = new User();
        user2.setUserName("john777");
        user2.setEmailAddress("johnnyb@gmail.com");
        user2.setUserID(2);
        user2.setPassword("abcde");
        //3rd
        User user3 = new User();
        user3.setUserName("hanzomaker");
        user3.setEmailAddress("overwatchrules@gmail.com");
        user3.setUserID(3);
        user3.setPassword("4j4kl");

        //add users to the arraylist
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }

    /**
     * @param userIds an array of all associated userIds
     * @return a list of matching users
     */
    @Override
    public List<User> loadAllByIds(int[] userIds) throws Exception{
        return null;
    }

    /**
     * return a user matching the username
     * @param userName of the user wanted
     * @return the user object associated with the userName
     * @throws Exception if an error occurs
     */
    @Override
    public User findByName(String userName) throws Exception{
        List<User> userList = this.getAll();
        User user;

        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getUserName().equals(userName)) {
                user = userList.get(i);
                return user;
            }
        }
        throw new Exception("could not find user");
    }

    /**
     *
     * @param users that will be entered into the db
     * @throws Exception if a error occurs
     */
    @Override
    public void insertAll(User... users) throws Exception {
        //have to decide on how to this

    }

    /**
     * should delete the given user
     * @param user that is to be deleted
     */
    @Override
    public void delete(User user) {
        List<User> userList = this.getAll();

        if(userList.contains(user)) {
            userList.remove(userList.indexOf(user));
        }
    }
}
