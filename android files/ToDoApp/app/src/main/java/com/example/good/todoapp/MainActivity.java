package com.example.good.todoapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Dbhelper dbhelper;
    ArrayAdapter<String> mAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        dbhelper = new Dbhelper(this);

        loadTask();
    }
    //Add icon menu bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }





    // LOAD ALL TASK

    private void loadTask(){
        ArrayList<String> taskList = dbhelper.getTaskList();

        if (mAdapter == null){
            mAdapter = new ArrayAdapter<String>(this,R.layout.row,R.id.task_title,taskList);
            listView.setAdapter(mAdapter);
        } else{
            mAdapter.clear();
            mAdapter.addAll(taskList);
            mAdapter.notifyDataSetChanged();
        }




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.addTask:
                final EditText editText = new EditText(this);
                AlertDialog dialog = new AlertDialog.Builder(this)
                        .setTitle("Add new Task")
                        .setMessage("What your task")
                        .setView(editText)
                        .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String task = String.valueOf(editText.getText());
                                dbhelper.insertNewTask(task);

                                loadTask();
                            }
                        })
                        .setNegativeButton("CANCEL",null)
                        .create();
                dialog.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void deleteTask(View view)
    {
        try{
            int index = listView.getPositionForView(view);
            String task = mAdapter.getItem(index++);
            dbhelper.deleteTask(task);
            loadTask();
        }catch (Exception e){
            Toast.makeText(this,e.getMessage().toString(),Toast.LENGTH_SHORT).show();
        }
    }
}
