package com.kv.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<State> states;

    StateAdapter(Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position) {
        State state = states.get(position);
        //holder.scoreView.setText(state.getScore());
        holder.nameView.setText(state.getName());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    //another classSSSSSSSSSSSSSSSSSS
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView/*, scoreView*/;

        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.name);
            //scoreView = view.findViewById(R.id.score);
        }
    }
}
