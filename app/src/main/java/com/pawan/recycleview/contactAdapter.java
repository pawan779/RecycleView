package com.pawan.recycleview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ContactsViewHolder>{

Context mContext;
List<contracts>contractsList;

    public contactAdapter(Context mContext, List<contracts> contractsList) {
        this.mContext = mContext;
        this.contractsList = contractsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

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
