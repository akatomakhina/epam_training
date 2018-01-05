package by.epamTrainings.task3dot4.runner;

import by.epamTrainings.task3dot4.entity.ArrayList;
import by.epamTrainings.task3dot4.entity.LinkedList;
import by.epamTrainings.task3dot4.entity.interfaces.Iterator;
import by.epamTrainings.task3dot4.entity.interfaces.List;

public class Run {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("nastichka");
        list.add(6);
        list.add("lnln");
        list.addValues(new Object[]{"nnn", 123, 124.5, 23f, "kto", "zdes", "kotik"});
        list.remove(0);
        list.remove("lnln");
        System.out.println(list.get(1));
        Iterator iter = list.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
