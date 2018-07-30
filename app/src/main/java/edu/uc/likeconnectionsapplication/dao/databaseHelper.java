//Old database

package edu.uc.likeconnectionsapplication.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "profile.db";
    public static final String TABLE_NAME ="profile_table";
    public static final String COL_1 ="ID";
    public static final String COL_2 ="Email";
    public static final String COL_3 ="UserName";
    public static final String COL_4 ="Password";

    /**
     *
     * @param context
     */
    public databaseHelper( Context context ) {
        super(context, DATABASE_NAME, null, 1);
    }

    /**
     *
     * @param db
     */
    @Override
    public void onCreate( SQLiteDatabase db ) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, firstName TEXT, lastName TEXT)");
    }

    /**
     *
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade( SQLiteDatabase db, int oldVersion, int newVersion ) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String email, String userName, String password){
        SQLiteDatabase db = this.getWritableDatabase(); //creates database
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,userName);
        contentValues.put(COL_4,password);
        long result = db.insert(TABLE_NAME,null, contentValues);
        if (result == -1){
            return false;
        }else{
            return true;
        }
    }
}