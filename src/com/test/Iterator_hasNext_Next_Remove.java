package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_hasNext_Next_Remove {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

       Iterator<String> it = s.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();//можно удалить с помощью remove(), но перед удалением необходимо вызвать next()
        }
        System.out.println(s);

    }
}
