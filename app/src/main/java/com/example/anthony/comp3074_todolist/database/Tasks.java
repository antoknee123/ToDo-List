package com.example.anthony.comp3074_todolist.database;
//Anthony Kwan - Student Number 100969393
import android.provider.BaseColumns;



public class Tasks {
    public static final String DB_NAME = "com.example.anthony.comp3074_todolist.database";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
