package com.example.urban_ride.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.urban_ride.R;
import com.example.urban_ride.managers.ResourceManager;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String db_name = "finanza";

    private static final int db_version = 1;

    public static final String table_ahorro = "main";

    public static final String table_history = "history";


    private static String db_query_ahorro = "CREATE TABLE IF NOT EXISTS " + table_ahorro + "(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT." +
            "servicioUsado TEXT NOT NULL," +
            "precioUsado REAL NOT NULL," +
            "precioMax REAL NOT NULL," +
            "fecha INTEGER NOT NULL" +
            ")";

    private static String db_query_history = "CREATE TABLE IF NOT EXISTS " + table_history + "(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "place TEXT NOT NULL," +
            "type TEXT NOT NULL" +
            ")";

    public SQLiteHelper(Context context){super(context, db_name, null, db_version);}

    @Override
    public void onCreate(SQLiteDatabase database){
        database.execSQL(db_query_ahorro);
        database.execSQL(db_query_history);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int mewVersion){
       database.execSQL("DROP TABLE IF EXISTS" + table_ahorro);
        database.execSQL("DROP TABLE IF EXISTS" + table_history);
    }
    

}
