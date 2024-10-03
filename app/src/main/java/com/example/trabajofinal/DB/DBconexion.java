package com.example.trabajofinal.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBconexion extends SQLiteOpenHelper {
        private static final String DB_NAME ="dbcodea";
        private static final int DB_VERSION= 1;

    public DBconexion(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //codigo sql
        sqLiteDatabase.execSQL(DBmanager.TABLA_EMPRESA_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //codigo sql
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ DBmanager.TABLA_EMPRESA);

    }
}
