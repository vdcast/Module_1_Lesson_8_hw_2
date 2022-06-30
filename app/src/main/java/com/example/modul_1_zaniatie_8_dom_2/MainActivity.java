package com.example.modul_1_zaniatie_8_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //date from server

        String name = "Ivan";
        String lastName = "Kozak";

        //ArrayList for Comment object
        Comment comment = new Comment("","","","");
        Comment comment_1 = new Comment("Petro", "Chumak", "Good job!",
                "19/06/22");
        Comment comment_2 = new Comment("Stepan", "Karas", "Yeah man, nice one!",
                "19/06/22");

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment_1);
        comments.add(comment_2);

        Reactions reactions = new Reactions("2","4","8");

        //check if name or lastName is null
        if (name == null){
            name = "First Name";
        }
        if (lastName == null){
            lastName = "Last Name";
        }
        Log.d("MYLOG", "Posted by " + name + " " + lastName);

        //check if Reactions has only numbers for addition
        int sumOfReactions;
        try {
            sumOfReactions = Integer.parseInt(reactions.thumbsUp) + Integer.parseInt(reactions.oks) +
                    Integer.parseInt(reactions.hearts);
        }catch (NumberFormatException nfe){
            sumOfReactions = 0;
            Log.d("MYLOG", "Please, check reactions income, something wrong.");
        }
        Log.d("MYLOG", "Sum of reactions: " + sumOfReactions);


        //check if our ArrayList is empty
        if (comments.isEmpty()){
            Log.d("MYLOG", "No comments, yet");
        }else{
            Log.d("MYLOG", comment_1.authorName + " " + comment_1.authorLastName +
                    " said: " + comment_1.text + " | " + comment_1.date);
            Log.d("MYLOG", comment_2.authorName + " " + comment_2.authorLastName +
                    " said: " + comment_2.text + " | " + comment_2.date);
        }







    }
}