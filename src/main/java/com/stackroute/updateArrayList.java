package com.stackroute;

import java.util.ArrayList;

public class updateArrayList {


    public ArrayList<String> update(ArrayList<String> arrayList) {

        arrayList.set(0,"Kiwi");
        arrayList.set(2,"Mango");
        return arrayList;
    }

    public ArrayList<String> Remove(ArrayList<String> arrayList) {
        arrayList.clear();
        return arrayList;
    }
}
