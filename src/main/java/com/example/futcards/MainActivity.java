package com.example.futcards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.MenuItem;
import android.widget.Toolbar;


import com.example.futcards.databinding.ActivityMainBinding;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("FUT CARDS");
        SpannableString s = new SpannableString(getSupportActionBar().getTitle());
        s.setSpan(new TypefaceSpan("sans-serif-condensed"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);

        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));

        binding.btnSuper.setOnClickListener(v->{
             Intent i = new Intent(MainActivity.this, MainActivity2.class);
             i.putExtra("msg", "Super Lig");
             startActivity(i);
        });
        binding.btnWomen.setOnClickListener(v->{
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("msg", "Barclays WSL");
            startActivity(i);
        });


    }

}