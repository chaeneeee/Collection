package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        // TODO:
        //추가할 위치의 인덱스 정수를 입력받아 주어진 요소를
        // 인덱스에 추가하고 리턴하기
        //arraylist
        //index
        //element
        //입력받은 인덱스가 arraylist 크기 벗어나면 null 리턴 인덱스 8인데 arraylist 가 12345 index 4일 때
        if (arrayList.size() < index ) {
            return null;
        } else {
            arrayList.add(index,element);

        }

            return arrayList;
    }
}
