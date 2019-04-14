package com.example.listviewwithjsondata;

public class ListItem {
    private String item_name;
    private String item_description;
    private String item_image;

    public ListItem(String item_name, String item_description, String item_image){
        this.item_name = item_name;
        this.item_image = item_image;
        this.item_description = item_description;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getItem_description() {
        return item_description;
    }

    public String getItem_image() {
        return item_image;
    }
}
