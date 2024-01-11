package com.example.futcards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerVievHolder> {


    Context ctx;
    List<Player> data;
    public PlayerAdapter(Context ctx, List<Player> data) {
        this.ctx = ctx;
        this.data = data;
    }

    @NonNull
    @Override
    public PlayerVievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(ctx).inflate(R.layout.player_row_layout, parent, false);
        PlayerAdapter.PlayerVievHolder holder = new PlayerAdapter.PlayerVievHolder(root);
        holder.setIsRecyclable(false);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerVievHolder holder, int position) {
        holder.txtPlayerName.setText(data.get(position).getName());
        ExecutorService srv = ((FutCardApplication)((Activity)ctx).getApplication()).srv;
        holder.row.setOnClickListener(v -> {

            Intent i = new Intent(ctx,MainActivity4.class );
            i.putExtra( "msg",data.get(position).getName());

            ctx.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PlayerVievHolder extends RecyclerView.ViewHolder{

        ConstraintLayout row;
        TextView txtPlayerName;
        public PlayerVievHolder(@NonNull View itemView) {
            super(itemView);

            row = itemView.findViewById(R.id.playerRow);
            txtPlayerName = itemView.findViewById(R.id.playerTxt);
        }
    }
}
