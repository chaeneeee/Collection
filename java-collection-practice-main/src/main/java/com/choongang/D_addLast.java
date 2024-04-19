package com.choongang;

import java.util.ArrayList;

public class D_addLast {
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        // TODO:
        //add ( index 값 , 추가할 요소 )
        arrayList.add(arrayList.size(), str);
        // array 가 [12345] 라면 index 는 4까지 새로 오는 index는 5
        //근데 size는 array 개수니까 5
        return arrayList;
    }
}
