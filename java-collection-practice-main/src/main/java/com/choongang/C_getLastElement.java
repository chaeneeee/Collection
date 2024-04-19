package com.choongang;

import java.util.ArrayList;

public class C_getLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        // TODO:
        //array 마지막 요소 리턴
        //빈 array 는 null

        if (arrayList.size()==0){
            return null;
        }else {
            return arrayList.get(arrayList.size()-1);
        }

    }
}
