package com.example.futcards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

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

import com.example.futcards.databinding.ActivityMain2Binding;
import com.example.futcards.databinding.ActivityMain3Binding;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;
    Handler uiHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            List<Player> data = (List<Player>)msg.obj;
            PlayerAdapter adp = new PlayerAdapter(MainActivity3.this, data);
            binding.playerRec.setAdapter(adp);
            return true;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        binding.playerRec.setLayoutManager(new LinearLayoutManager(MainActivity3.this));


        FutCardRepo repo = new FutCardRepo();
        ExecutorService srv = ((FutCardApplication)getApplication()).srv;
        String teamName = getIntent().getStringExtra("msg");
        repo.searchTeamByName(srv,uiHandler, teamName);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);
        actionBar.setTitle(teamName);
        SpannableString s = new SpannableString(getSupportActionBar().getTitle());
        s.setSpan(new TypefaceSpan("sans-serif-condensed"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));

        setContentView(binding.getRoot());

    }
}