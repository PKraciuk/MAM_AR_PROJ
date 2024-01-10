package com.example.arcorefirst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class ModelAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ModelObject> modelObjects;

    public ModelAdapter(Context context, ArrayList<ModelObject> modelObjects) {
        this.context = context;
        this.modelObjects = modelObjects;
    }

    @Override
    public int getCount() {
        return modelObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return modelObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_model, parent, false);
        }

        TextView textViewModelName = convertView.findViewById(R.id.textViewModelName);
        CheckBox checkBoxVisible = convertView.findViewById(R.id.checkBoxVisible);
        Button buttonDelete = convertView.findViewById(R.id.buttonDelete);

        ModelObject model = modelObjects.get(position);
        textViewModelName.setText(model.getName());
        checkBoxVisible.setChecked(model.isVisible());

        checkBoxVisible.setOnCheckedChangeListener((buttonView, isChecked) -> {
            model.setVisible(isChecked);
        });

        buttonDelete.setOnClickListener(v -> {
            modelObjects.remove(position);
            modelObjects.get(position).delete();
            notifyDataSetChanged();
        });

        return convertView;
    }
}
