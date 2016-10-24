package com.example.sophiataskova.taskqueueingapp.models;


import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tasks {

    public static final List<Task> ITEMS = new ArrayList<Task>();


    public static final Map<String, Task> ITEM_MAP = new HashMap<String, Task>();

    private static void addItem(Task item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Task createTask(int position, String name, String text, LatLng coordinates) {
        return new Task(String.valueOf(position), name, text, coordinates);
    }

    public static class Task {

        private final String id;
        private String name;
        private String text;
        private LatLng coordinates;

        public Task(String id, String name, String text, LatLng coordinates) {
            this.id = id;
            this.name = name;
            this.text = text;
            this.coordinates = coordinates;
        }

        public String getId() {
            return id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LatLng getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(LatLng coordinates) {
            this.coordinates = coordinates;
        }
    }


}
