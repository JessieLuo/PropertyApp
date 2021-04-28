package com.example.propertyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {
    private List<com.example.propertyapp.Property> PropertyList;
    private Context context;

    public PropertyAdapter(List<Property> propertyList, Context context) {
        PropertyList = propertyList;
        this.context = context;
    }

    @NonNull
    @Override
    public PropertyAdapter.PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.property_row, parent, false);
        return new PropertyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyAdapter.PropertyViewHolder holder, int position) {
        holder.propertyImageView.setImageResource(PropertyList.get(position).getImage());
        holder.addressTextView.setText(PropertyList.get(position).getAddress());
        holder.rentTextView.setText(PropertyList.get(position).getRent());
        holder.bedTextView.setText(PropertyList.get(position).getBedroom());
        holder.bathTextView.setText(PropertyList.get(position).getBath());
        holder.carTextView.setText(PropertyList.get(position).getCar());
    }

    @Override
    public int getItemCount() {
        return PropertyList.size();
    }

    public class PropertyViewHolder extends RecyclerView.ViewHolder{
        public ImageView propertyImageView;
        public TextView addressTextView, rentTextView, bedTextView, bathTextView, carTextView;
        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);
            propertyImageView = itemView.findViewById(R.id.propertyImageView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            rentTextView = itemView.findViewById(R.id.rentTextView);
            bedTextView = itemView.findViewById(R.id.bedTextView);
            bathTextView = itemView.findViewById(R.id.bathTextView);
            carTextView = itemView.findViewById(R.id.carTextView);

        }
    }
}

