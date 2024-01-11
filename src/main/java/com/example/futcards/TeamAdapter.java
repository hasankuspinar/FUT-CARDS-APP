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

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    Context ctx;
    List<Team> data;

    public TeamAdapter(Context ctx, List<Team> data) {
        this.ctx = ctx;
        this.data = data;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(ctx).inflate(R.layout.team_row_layout, parent, false);
        TeamViewHolder holder = new TeamViewHolder(root);
        holder.setIsRecyclable(false);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        holder.txtTeamName.setText(data.get(position).getName());
        ExecutorService srv = ((FutCardApplication)((Activity)ctx).getApplication()).srv;
        holder.row.setOnClickListener(v -> {

            Intent i = new Intent(ctx,MainActivity3.class );
            i.putExtra( "msg",data.get(position).getName());

            ctx.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class TeamViewHolder extends RecyclerView.ViewHolder{
        ConstraintLayout row;
        TextView txtTeamName;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            row = itemView.findViewById(R.id.teamRow);
            txtTeamName = itemView.findViewById(R.id.txtTeamName);
        }
    }
}
