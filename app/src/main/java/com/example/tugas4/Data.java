package com.example.tugas4;

import java.util.ArrayList;

public class Data {
    private static String[] title = new String[]{"YAMAHA","KAWASAKI","HONDA","SUZUKI"};
    private static int[] thumbnail = new
            int[]{R.drawable.yamaha,R.drawable.kawasaki,R.drawable.honda,R.drawable.suzuki};

    public static ArrayList<Model> getlistData(){
        Model Model = null;
        ArrayList<Model> list = new ArrayList<>();

        for (int i = 0; i <title.length; i++){
            Model = new Model();
            Model.setLogo(thumbnail[i]);
            Model.setNama(title[i]);
            list.add(Model);
        }
        return list;
    }
}