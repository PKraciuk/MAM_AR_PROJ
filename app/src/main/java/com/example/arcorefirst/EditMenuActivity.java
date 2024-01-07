package com.example.arcorefirst;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EditMenuActivity extends AppCompatActivity {

    private ModelAdapter modelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_menu); // Create a new layout for this activity
        ArrayList<ModelObject> modelObjects = GlobalData.getInstance().getModelObjects();
        modelAdapter = new ModelAdapter(this, modelObjects);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(modelAdapter);
    }
}

