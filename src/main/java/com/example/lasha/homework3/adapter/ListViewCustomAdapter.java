package com.example.lasha.homework3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lasha.homework3.R;
import com.example.lasha.homework3.model.Vehicle;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by lasha on 3/25/2015.
 */
public class ListViewCustomAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private List<Vehicle> data;

    public ListViewCustomAdapter(LayoutInflater inflater, List<Vehicle> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        Holder holder;
        if (convertView == null) {
            view = inflater.inflate(R.layout.list_item, null);

            holder = new Holder();
            holder.image = (ImageView) view.findViewById(R.id.item_image);
            holder.name = (TextView) view.findViewById(R.id.item_name);
            holder.price = (TextView) view.findViewById(R.id.item_price);
            holder.fuel = (TextView) view.findViewById(R.id.item_fuel);
            holder.acceleration = (TextView) view.findViewById(R.id.item_acceleration);
            holder.power = (TextView) view.findViewById(R.id.item_power);
            holder.speed = (TextView) view.findViewById(R.id.item_speed);


            view.setTag(holder);

        } else {
            view = convertView;
            holder = (Holder) view.getTag();
        }

        Vehicle vehicle = (Vehicle)getItem(position);
        holder.image.setImageResource(vehicle.getPhotoId());
        holder.name.setText(vehicle.getModel());
        holder.price.setText(" : " + vehicle.getPrice()+" $");
        holder.fuel.setText(" : " +  vehicle.getFuelCity() + " city/" + vehicle.getFuelHwy() + " hwy");
        holder.acceleration.setText(" : " + vehicle.getAcceleration() + " sec");
        holder.power.setText(" : " + vehicle.getPower() + " hp");
        holder.speed.setText(" : " + vehicle.getSpeed() + "mph");

        return view;
    }


    private static class Holder {
        public ImageView image;
        public TextView name;
        public TextView price;
        public TextView fuel;
        public TextView acceleration;
        public TextView power;
        public TextView speed;
    }
}
