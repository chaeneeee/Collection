package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        //index 크기 벗어나면 null
         if (arrayList.size() < index ) {
             return null;
         }else {
             arrayList.set(index,str);

    }return arrayList;
}}
