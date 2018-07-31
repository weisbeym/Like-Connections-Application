package edu.uc.likeconnectionsapplication;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import edu.uc.likeconnectionsapplication.dao.UserDao;
import edu.uc.likeconnectionsapplication.dao.UserDaoStub;
import edu.uc.likeconnectionsapplication.dto.User;

public class UserDaoTest extends TestCase {

    UserDao userDAO;

    @Override
    @Before
    protected void setUp() throws Exception {
        // TODO Auto-generated method stub
        super.setUp();
        userDAO = new UserDaoStub();
    }

    @Test
    public void testGetAll() {
        List<User> users = new ArrayList<>();
        User billy = users.get(0);
        assertNotNull(billy);
        assertEquals(billy.getUserName(), "billy@bob");
        assertEquals(billy.getEmailAddress(), "bb@gmail.com");
        assertEquals(billy.getUserID(), 1);
        assertEquals(billy.getPassword(), "12345");
    }

    @Test
    public void testLoadByIds() {

    }

    @Test
    public void testFindByName() {
        try {
            assertNotNull(userDAO.findByName("john777"));
        } catch (Exception e) {
            fail("should return user2");
        }
        try {
            assertNull(userDAO.findByName("sam555"));
        } catch (Exception e) {
            fail("should not return a nonexistent user");
        }
    }

    @Test
    public void testInsertAll() {
        //have to wait for implementation
    }

    @Test
    public void testDelete() {
        List<User> users = new ArrayList<>();
        User billy = users.get(0);
        User notUser = users.get(6);

        try {
            userDAO.delete(billy);
        } catch (Exception e) {
            fail("should have deleted user");
        }
        try {
            userDAO.delete(notUser);
            fail("should not be able to delete, this user does not exist");
        } catch (Exception e) {

        }
    }
}
