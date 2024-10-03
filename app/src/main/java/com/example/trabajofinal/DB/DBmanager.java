package com.example.trabajofinal.DB;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBmanager {
    ///TABLA EMPRESA
    public static final String TABLA_EMPRESA  =   "empresas";
    public static final String EMPRESA_ID     =   "ID";
    public static final String EMPRESA_NOMBRE =   "NOMBRE";

    public static final String TABLA_EMPRESA_CREATE = "create table empresas(_id integer not null,nombre text not null);";

    private DBconexion     _conexion;
    private SQLiteDatabase _basededatos;

    public DBmanager(Context context) {
        _conexion = new DBconexion (context);
    }

    public DBmanager open() throws SQLException{
        _basededatos = _conexion.getReadableDatabase();
        return this;
    }
    public void close(){
        _conexion.close();
    }
}
