package edu.uc.likeconnectionsapplication.dao;
import edu.uc.likeconnectionsapplication.dto.User;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import edu.uc.likeconnectionsapplication.dto.User;
//My group has found success with Firebase for data storage. Could possibly be a better solution
@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds) throws Exception;

    @Query("SELECT * FROM users WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    User findByName(String userName) throws Exception;

    @Insert
    void insertAll(User... users) throws Exception;

    @Delete
    void delete(User user);
}
