package com.example.doraonlineshopping.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.doraonlineshopping.Activity.DetailActivity;
import com.example.doraonlineshopping.databinding.ViewholderPupListBinding;
import com.example.doraonlineshopping.domain.PopularDomain;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.Viewholder> {
    ArrayList<PopularDomain> items;
    Context context;
    ViewholderPupListBinding binding;

    public PopularAdapter(ArrayList<PopularDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public PopularAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding=ViewholderPupListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        context=parent.getContext();
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.Viewholder holder, int position) {
        binding.titleTxt.setText(items.get(position).getTitle());
        binding.feeTxt.setText("Rs."+items.get(position).getPrice());
        binding.scoreTxt.setText(""+items.get(position).getScore());

        int drawableResourced=holder.itemView.getResources().getIdentifier(items.get(position).getPicUrl(),"drawable"
                ,holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourced)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(binding.pic);

        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, DetailActivity.class);
            intent.putExtra("object", items.get(position));
            context.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        public Viewholder(ViewholderPupListBinding binding) {
            super(binding.getRoot());
        }
    }
}
