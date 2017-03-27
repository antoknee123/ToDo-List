package com.example.anthony.comp3074_todolist.database;
//Anthony Kwan - Student Number 100969393
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class TaskDb extends SQLiteOpenHelper {

    public TaskDb(Context context) {
        super(context, Tasks.DB_NAME, null, Tasks.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String createTable = "CREATE TABLE " + Tasks.TaskEntry.TABLE + " ( " +
                Tasks.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Tasks.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        database.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + Tasks.TaskEntry.TABLE);
        onCreate(database);
    }
}
