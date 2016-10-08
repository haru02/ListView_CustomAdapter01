package com.example.froze.listviewex01;

/**
 * Created by froze on 2016-10-08.
 */

public class DataProvider {

    private String title;
    private String name;
    private int image;

    public DataProvider(String title, String name, int image){
        this.title=title;
        this.name=name;
        this.image=image;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
