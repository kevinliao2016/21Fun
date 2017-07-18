package com.ninjamonster.a24fun;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/**
 * Created by kevin2016 on 6/17/17.
 */

public class NumericSetDatabaseHelper extends SQLiteOpenHelper{

    private final static int DATABASE_VERSION = 1;
    private final static String DATABASE_NAME = "NumericSet";

    private enum HandlerMessage {
        RetreiveEvent;
        private static HandlerMessage valueOf(int ordinal) {
            if(ordinal<0 || ordinal >= HandlerMessage.values().length){
                throw new IllegalArgumentException();
            }
            return HandlerMessage.values()[ordinal];
        }
    }

    private NumericSetDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        HandlerThread ht = new HandlerThread("databaseHandler thread");
        ht.start();

    }

    private class DatabaseHandler extends Handler {
        DatabaseHandler(Looper looper){
            super(looper);
        }

        @Override
        public void handleMessage(Message msg) {
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
