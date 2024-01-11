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

import com.example.futcards.databinding.ActivityMain3Binding;
import com.example.futcards.databinding.ActivityMain4Binding;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class MainActivity4 extends AppCompatActivity {

    ActivityMain4Binding binding;
    Handler uiHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            Player player = (Player) msg.obj;
            binding.txtDef.setText("DEF  " + String.valueOf(player.getDef()));
            binding.txtDri.setText("DRI  " + String.valueOf(player.getDri()));
            binding.txtPac.setText("PAC  " + String.valueOf(player.getPac()));
            binding.txtPas.setText("PAS  " + String.valueOf(player.getPass()));
            binding.txtSho.setText("SHO  " + String.valueOf(player.getShoot()));
            binding.txtPhy.setText("PHY  " + String.valueOf(player.getPhy()));
            binding.txtPos.setText("POS  " + String.valueOf(player.getPos()));
            binding.txtOvr.setText("OVR  " + String.valueOf(player.getOvr()));
            binding.txtNat.setText(player.getNat().toString());
            binding.txtName.setText(player.getName().toString());
            return true;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain4Binding.inflate(getLayoutInflater());

        FutCardRepo repo = new FutCardRepo();
        ExecutorService srv = ((FutCardApplication) getApplication()).srv;
        String playerName = getIntent().getStringExtra("msg");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Player");
        actionBar.setDisplayHomeAsUpEnabled(true);
        SpannableString s = new SpannableString(getSupportActionBar().getTitle());
        s.setSpan(new TypefaceSpan("sans-serif-condensed"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new StyleSpan(Typeface.BOLD), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));
        repo.searchPlayerByName(srv, uiHandler, playerName);
        setContentView(binding.getRoot());

    }

}