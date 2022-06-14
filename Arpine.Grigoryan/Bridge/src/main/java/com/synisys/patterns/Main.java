package com.synisys.patterns;

import com.synisys.patterns.impl.OrderedListImpl;
import com.synisys.patterns.impl.UniqueListImpl;
import com.synisys.patterns.implementor.BaseOrderedList;
import com.synisys.patterns.implementor.BaseUniqueList;

public class Main {
    public static void main(String[] args) {

        OrderedListImpl orderedList = new OrderedListImpl();
        orderedList.addItem("A");
        orderedList.addItem("B");
        orderedList.addItem("A");
        orderedList.addItem("C");

        UniqueListImpl uniqueList = new UniqueListImpl();
        uniqueList.addItem("A");
        uniqueList.addItem("B");
        uniqueList.addItem("A");
        uniqueList.addItem("C");


        BaseOrderedList baseOrderdList = new BaseOrderedList(orderedList);
        System.out.println("Count is : " + baseOrderdList.getCount() + " Add operation count is : " + baseOrderdList.getAddOperationCount() + "  FirstItem : " + baseOrderdList.getFirstItem());

        BaseUniqueList baseUniqueList = new BaseUniqueList(uniqueList);
        System.out.println("Count is : " + baseUniqueList.getCount() + " Add operation count is : " + baseUniqueList.getAddOperationCount() + "  FirstItem : " + baseUniqueList.getFirstItem());

    }
}
