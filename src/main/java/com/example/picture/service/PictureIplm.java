package com.example.picture.service;

import com.example.picture.model.Picture;

import java.util.ArrayList;
import java.util.List;

public class PictureIplm implements InterfacePicture {
    private static List<Picture> pictures = new ArrayList<>();

    static {
        pictures.add(new Picture(0, 1, 20, 10, "Vai", "xin", 100000));
        pictures.add(new Picture(1, 2, 30, 20, "Vai", "xin", 200000));
        pictures.add(new Picture(2, 3, 40, 30, "Vai", "xin", 300000));
        pictures.add(new Picture(3, 4, 50, 40, "Vai", "xin", 400000));
    }

    @Override
    public List<Picture> findAll() {
        return pictures;
    }

    @Override
    public void addNew(Picture picture) {
        pictures.add(picture);
    }

    @Override
    public Picture findById(int id) {
        for (int i = 0; i < pictures.size(); i++) {
            if (pictures.get(i).getId() == id) {
                return pictures.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Picture picture) {
        pictures.set(id, picture);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < pictures.size(); i++) {
            if (pictures.get(i).getId() == id) {
                pictures.remove(id);
            }
        }
    }
}
