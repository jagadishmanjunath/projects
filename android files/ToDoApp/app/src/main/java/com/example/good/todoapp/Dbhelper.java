package com.example.good.todoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by good on 11/2/2017.
 */

public class Dbhelper extends SQLiteOpenHelper {

    private static final String DB_NAME ="TESTER";
    private static final int DB_VER = 1;
    private static final String DB_TABLE="Task";
    private static final String DB_coloum="TaskName";

    public Dbhelper (Context context)
    {
        super(context,DB_NAME,null,DB_VER);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = String.format("CREATE%s(ID INTEGER PRIMARY KEY AUTOINCREMENT,%S TEXT NOT NULL);",DB_TABLE,DB_coloum);
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = String.format("DELETE TABLE IF EXITS %s" , DB_TABLE);
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);

    }
    public void insertNewTask (String task)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DB_coloum,task);
        db.insertWithOnConflict(DB_TABLE,null,values,SQLiteDatabase.CONFLICT_REPLACE);

    }


    public void deleteTask (String task)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DB_TABLE, DB_coloum + "=?",new String[]{task});
        db.close();
    }

    public ArrayList<String> getTaskList(){
        ArrayList<String> tasklist = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(DB_TABLE,new String[]{DB_coloum},null,null,null,null,null);

        while (cursor.moveToNext())
        {
            int index = cursor.getColumnIndex(DB_coloum);
            tasklist.add(cursor.getString(index));
        }
        cursor.close();
        db.close();

        return tasklist;
    }
}
