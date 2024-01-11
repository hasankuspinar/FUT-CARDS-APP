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
import com.example.futcards.databinding.ActivityMainBinding;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class MainActivity2 extends AppCompatActivity {

    Handler uiHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            List<Team> data = (List<Team>)msg.obj;
            TeamAdapter adp = new TeamAdapter(MainActivity2.this, data);
            binding.TeamRecView.setAdapter(adp);
            return true;
        }
    });
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        binding.TeamRecView.setLayoutManager(new LinearLayoutManager(MainActivity2.this));

        FutCardRepo repo = new FutCardRepo();
        ExecutorService srv = ((FutCardApplication)getApplication()).srv;
        String leagueName = getIntent().getStringExtra("msg");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(leagueName);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);
        SpannableString s = new SpannableString(getSupportActionBar().getTitle());
        s.setSpan(new TypefaceSpan("sans-serif-condensed"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));

        repo.searchLeagueByName(srv,uiHandler, leagueName);

        setContentView(binding.getRoot());

    }
}