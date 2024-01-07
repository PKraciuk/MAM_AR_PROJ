package com.example.arcorefirst;

import java.util.ArrayList;

public class GlobalData {
    private static final GlobalData ourInstance = new GlobalData();

    public static GlobalData getInstance() {
        return ourInstance;
    }

    private ArrayList<ModelObject> modelObjects = new ArrayList<>();

    private GlobalData() {}

    public ArrayList<ModelObject> getModelObjects() {
        return modelObjects;
    }

    public void setModelObjects(ArrayList<ModelObject> modelObjects) {
        this.modelObjects = modelObjects;
    }
}