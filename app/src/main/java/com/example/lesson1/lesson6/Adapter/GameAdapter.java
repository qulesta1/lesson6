package com.example.lesson1.lesson6.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson1.lesson6.Data.GameModel;
import com.example.lesson1.lesson6.Interface.OnItemClicklistener;
import com.example.lesson1.lesson6.databinding.ListHolderBinding;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
ArrayList<GameModel> list = new ArrayList<>();
OnItemClicklistener onItemClicklistener;


    public void setOnItemClicklistener(OnItemClicklistener onItemClicklistener) {
        this.onItemClicklistener = onItemClicklistener;
    }

    public GameAdapter(ArrayList<GameModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public GameAdapter.GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.GameHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        ListHolderBinding binding;
        public GameHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(GameModel gameModel) {
            binding.tvTittle.setText(gameModel.getLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClicklistener.onItemClick(gameModel);

                }
            });
        }
    }
}


