/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.model;

import java.util.ArrayList;

/**
 *
 * @author jieliang
 */
public class Component {

    ArrayList<String> componentContent;
    String componentPath;
    String componentType;
    String componentFont_Float;
    int componentWidth;
    int componentHeight;
    ArrayList<String> componentCaption;

    //image
    public Component(String initComponentType, ArrayList<String> initComponentContent, String initComponentPath, int initComponentWidth, int initComponentHeight, String initComponentFont_Float, ArrayList<String> initComponentCaption) {
        componentContent = initComponentContent;
        componentPath = initComponentPath;
        componentWidth = initComponentWidth;
        componentHeight = initComponentHeight;
        componentType = initComponentType;
        componentFont_Float = initComponentFont_Float;
        componentCaption = initComponentCaption;
    }

    // header & list
    public Component() {
        this("",new ArrayList<String>(),"",0,0,"",new ArrayList<String>());
    }

    public ArrayList<String> getComponentContent() {
        return componentContent;
    }

    public String getComponentPath() {
        return componentPath;
    }

    public void setComponentPath(String initComponentPath) {
        componentPath = initComponentPath;
    }

    public String getComponentType() {
        return componentType;
    }

    public int getComponentWidth() {
        return componentWidth;
    }

    public void setComponentWidth(int initComponentWidth) {
        componentWidth = initComponentWidth;
    }

    public void setComponentHeight(int initComponentHeight) {
        componentHeight = initComponentHeight;
    }

    public int getComponentHeight() {
        return componentHeight;
    }

    public void setComponentType(String initComponentType) {
        componentType = initComponentType;
    }

    public String getComponentFont_Float() {
        return componentFont_Float;
    }

    public void setComponentFont_Float(String initComponentFont_Float) {
        componentFont_Float = initComponentFont_Float;
    }

    public ArrayList<String> getComponentCaption() {
        return componentCaption;
    }

}
