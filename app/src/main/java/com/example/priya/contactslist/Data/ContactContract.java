/*
package com.example.priya.contactslist.Data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

*/
/**
 * Created by Priya on 2/14/2016.
 *//*

public class ContactContract {
    public static final String CONTENT_AUTHORITY = "com.example.priya.contactslist";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_CONTACT = "contact";


    public static final class ContactsColumn implements BaseColumns {
        public static final String TABLE_NAME = "mycontacts";

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_CONTACT).build();

        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_CONTACT;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_CONTACT;


        public static final String KEY_NAME = "name";
        public static final String KEY_ADDRESS = "address";
        public static final String KEY_MOBILE = "mobile";
        public static final String KEY_HOME = "home";
        public static final String KEY_ROW_ID = "_id";
        public static final String PROJECTION[] = {
                KEY_ROW_ID,
                KEY_NAME,
                KEY_ADDRESS,
                KEY_MOBILE,
                KEY_HOME
        };

        public static Uri buildContactWithId(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        public static long getIdFromUri(Uri uri) {
            return ContentUris.parseId(uri);
        }
    }
}

*/
