package com.example.riteshraj.swipe_n_tab;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myHolder> {

    Context ctx;
    String string1[],string2[];
    int img[];

    public myAdapter(Context ct, String s1[], String s2[], int i1[]){
        ctx = ct;
        string1 = s1;
        string2 = s2;
        img = i1;

    }

    @NonNull
    @Override
    public myAdapter.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater =LayoutInflater.from(ctx);
        View myView = myInflater.inflate(R.layout.my_row,parent,false);
        return new myHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.myHolder holder, int position) {
        holder.t1.setText(string1[position]);
        holder.t2.setText(string2[position]);
        holder.iv.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return string1.length;
    }

    public class myHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView iv;

        public myHolder(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.textView1);
            t2 = itemView.findViewById(R.id.textView2);
            iv = itemView.findViewById(R.id.imageView);
        }
    }
}
