package com.example.arcorefirst;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.Renderable;

import java.io.Serializable;

public class ModelObject implements Serializable {
    private String name;
    private boolean isVisible;
    private AnchorNode anchorNode;

    private Renderable renderable;

    public ModelObject(String name, AnchorNode anchorNode, Renderable renderable) {
        this.name = name;
        this.isVisible = true;
        this.anchorNode = anchorNode;
        this.renderable = renderable;
//        updateModel();

    }


    public void setVisible(boolean visible) {
        if (this.isVisible) {
            this.isVisible = false;
            anchorNode.setEnabled(false);
        } else {
            this.isVisible = true;
            anchorNode.setEnabled(true);
        }
    }

    public void remove() {
        if (anchorNode != null) {
            anchorNode.setParent(null); // Remove the node from the scene
        }
    }

    public boolean isVisible() {
        return isVisible;
    }

    public AnchorNode getNode()
    {
        return anchorNode;
    }

    public String getName() {
        return name;
    }
}