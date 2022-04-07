package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MVH>{
    Context c;
    String[] titre,stitre;
    Integer[] images;

    public ListAdapter(Context c, String[] titre, String[] stitre, Integer[] images) {
        this.c = c;
        this.titre = titre;
        this.stitre = stitre;
        this.images = images;
    }

    @NonNull
    @Override
    //pour creer le viewholder
    public MVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,parent,false);
        ListAdapter.MVH mvh = new ListAdapter.MVH(v);
        return mvh;
    }

    @Override
    //pour alimenter le viewholder bech n3abi
    public void onBindViewHolder(@NotNull ListAdapter.MVH holder, int i) {
    //etablir le lien entre les chaine de cara et les view holder
    holder.tit.setText(titre[i]);
    holder.stit.setText(stitre[i]);
    holder.img.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {
        return titre.length;
    }

    public class MVH extends RecyclerView.ViewHolder{


        TextView tit,stit;
        ImageView img;
        public MVH(@NonNull View itemView) {
            super(itemView);
            tit = itemView.findViewById(R.id.textView);
            stit = itemView.findViewById(R.id.textView);
            img  = itemView.findViewById(R.id.imageView);


        }
    }

}
