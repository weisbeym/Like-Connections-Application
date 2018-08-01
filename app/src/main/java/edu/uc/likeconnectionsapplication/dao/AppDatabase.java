package edu.uc.likeconnectionsapplication.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import edu.uc.likeconnectionsapplication.dto.User;
    @Database(entities = {User.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        //public abstract UserDao userDao();
    }
