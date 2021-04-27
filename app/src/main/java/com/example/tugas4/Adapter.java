package com.example.tugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private Context context;
    private ArrayList<Model> Models;

    public Adapter(ArrayList<Model> models, Context context) {
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Model> getModels() {
        return Models;
    }

    public void setModels(ArrayList<Model> Models) {
        this.Models = Models;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int i){
        Glide.with(context).load(getModels().get(i).getLogo()).into(holder.logo);
        holder.tvNama.setText(getModels().get(i).getNama());
    }

    @Override
    public int getItemCount(){
        return getModels().size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        private ImageView logo;
        private TextView tvNama;
        public viewHolder(@NonNull View itemView){
            super(itemView);
            logo = itemView.findViewById(R.id.cdlogo);
            tvNama = itemView.findViewById(R.id.nama);
        }
    }
}
