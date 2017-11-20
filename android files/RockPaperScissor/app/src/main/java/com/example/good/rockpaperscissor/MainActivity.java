package com.example.good.rockpaperscissor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {



    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference rootRef = db.getReference();
    DatabaseReference gameref = rootRef.child("game");

    // get the Ui elements

    TextView textView;
    Button rock, paper, scissor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//       rootRef.child("Users").child("01").child("Email").setValue("Somecool.com");
//       rootRef.child("Users").child("01").child("Name").setValue("Same");

     textView = findViewById(R.id.Rock);
     rock = findViewById(R.id.rock);
     paper = findViewById(R.id.paper);
     scissor = findViewById(R.id.scisoor);



     rock.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             gameref.setValue("Rock");
         }
     });

       scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameref.setValue("scissor");
            }
        });

       paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameref.setValue("paper");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        gameref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue().toString();
                textView.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("Tag","Something went wrong");
            }
        });
    }
}
