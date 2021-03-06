package com.example.sandy.miwoklanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti",R.drawable.number_one));
        numbers.add(new Word("two", "otiiko",R.drawable.number_two));
        numbers.add(new Word("three", "tolookosu",R.drawable.number_three));
        numbers.add(new Word("four", "oyyisa",R.drawable.number_four));
        numbers.add(new Word("five", "massokka",R.drawable.number_five));
        numbers.add(new Word("six", "temmokka",R.drawable.number_six));
        numbers.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        numbers.add(new Word("eight", "kawinta",R.drawable.number_eight));
        numbers.add(new Word("nine", "wo’e",R.drawable.number_nine));
        numbers.add(new Word("ten", "na’aacha",R.drawable.number_ten));

        ListView layout = (ListView) findViewById(R.id.numbers_list);

        WordAdapter itemsAdapter = new WordAdapter(this, numbers,R.color.category_numbers);

        layout.setAdapter(itemsAdapter);


    }


}
