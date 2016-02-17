/*
package com.example.priya.contactslist.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.priya.contactslist.Data.ContactContract.ContactsColumn;

*/
/**
 * Created by Priya on 2/14/2016.
 *//*

public class ContactsDbHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "contactDB";
    private static final int DATABASE_VERSION = 1;

    public ContactsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {

        final String CREATE_CONTACT_TABLE=
                "create table "+ ContactsColumn.TABLE_NAME + "("+
                        ContactsColumn.KEY_ROW_ID + " integer primary key autoincrement,"+
                        ContactsColumn.KEY_NAME + " text not null,"+
                        ContactsColumn.KEY_ADDRESS + " text not null,"+
                        ContactsColumn.KEY_MOBILE + " text,"+
                        ContactsColumn.KEY_HOME + " text)";

        db.execSQL(CREATE_CONTACT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ContactsColumn.TABLE_NAME);
    }
}
*/
