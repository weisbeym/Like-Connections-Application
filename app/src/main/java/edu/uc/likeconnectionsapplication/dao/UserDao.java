package edu.uc.likeconnectionsapplication.dao;
import edu.uc.likeconnectionsapplication.dto.User;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import edu.uc.likeconnectionsapplication.dto.User;

// TODO fix these
// TODO errors error: There is a problem with the query: [SQLITE_ERROR] SQL error or missing database (no such table: users)
// TODO error: There is a problem with the query: [SQLITE_ERROR] SQL error or missing database (no such table: users)

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAll();

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds) throws Exception;

    @Query("SELECT * FROM users WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    public User findByName(String userName) throws Exception;

    @Insert
    public void insertAll(User... users) throws Exception;

    @Delete
    public void delete(User user);
}
