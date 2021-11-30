package com.example.krishimitra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.Query;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewfolder> {

    Context context;
    ArrayList<news> newsArrayList;

    public myadapter(Context context, ArrayList<news> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public myadapter.myviewfolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        return new myviewfolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myadapter.myviewfolder holder, int position) {
        news news = newsArrayList.get(position);
        holder.queryimage.setImageResource(news.titleimage);
        holder.queryheading.setText(news.heading);
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class myviewfolder extends RecyclerView.ViewHolder{

        TextView queryheading;
        ShapeableImageView queryimage;

        public myviewfolder(@NonNull View itemView) {
            super(itemView);
            queryheading = itemView.findViewById(R.id.query_text);
            queryimage = itemView.findViewById(R.id.query_imagex);
        }
    }
}
