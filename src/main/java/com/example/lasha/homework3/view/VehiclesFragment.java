package com.example.lasha.homework3.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.lasha.homework3.R;
import com.example.lasha.homework3.model.DB;
import com.example.lasha.homework3.adapter.ListViewCustomAdapter;
import com.example.lasha.homework3.model.Vehicle;

/**
 * Created by lasha on 3/30/2015.
 */
public class VehiclesFragment extends Fragment implements AdapterView.OnItemClickListener{
    private VehicleClickListener listener;
    private ListView listView;
    private BaseAdapter adapter;

    //register activity as listener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        listener = (MainActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vehicles, container, false);

        listView = (ListView) view.findViewById(R.id.list);
        adapter = new ListViewCustomAdapter(inflater, DB.getData());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (listener != null) {
            listener.onVehicleClick((Vehicle) adapter.getItem(position));
        }
    }
}
