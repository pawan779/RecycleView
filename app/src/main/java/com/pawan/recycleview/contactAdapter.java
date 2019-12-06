package com.pawan.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class contactAdapter {
    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvName,tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.ronaldo);
            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);
        }
    }
}
