package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        // TODO:
        if (arrayList.size()==0 || arrayList.size() < index ){
            return null;
        }


      return arrayList.remove(index);
    }
}
