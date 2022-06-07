package com.synisys.patterns.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> accessibleCategoriesForUser1  = new ArrayList<>();
        accessibleCategoriesForUser1.add(1);
        accessibleCategoriesForUser1.add(3);

        List<Integer> accessibleCategoriesForUser2  = new ArrayList<>();
        accessibleCategoriesForUser2.add(2);
        accessibleCategoriesForUser2.add(4);


        Map<Integer, List<Integer>>   userAccCat = new HashMap<>();
        userAccCat.put(1, accessibleCategoriesForUser1);
        userAccCat.put(2, accessibleCategoriesForUser2);


        Context context = new Context(userAccCat, "2", 1);

        CategoryAdapter categoryAdaptor = new CategoryAdapter(context, "1");
        System.out.println(categoryAdaptor.toString());
        CategoryAdapter categoryAdaptor2 = new CategoryAdapter(context, "2");
        System.out.println(categoryAdaptor2.toString());

    }
}
