package com.synisys.patterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Context {
    private Map<Integer, List<Integer>> usersAccessibleCategories;
    private final String currentLanguageId;
    private final Integer currentUserId;

    public Context(Map<Integer, List<Integer>> accessibleUsers, String currentLanguageId, Integer currentUserId) {
        this.usersAccessibleCategories = accessibleUsers;
        this.currentLanguageId = currentLanguageId;
        this.currentUserId = currentUserId;
    }


    public void addUsersAccessibleCategories(Integer userId, Integer categoryId) {
        if (!this.usersAccessibleCategories.containsKey(userId)) {
            this.usersAccessibleCategories.put(userId, new ArrayList<Integer>());
        }
        this.usersAccessibleCategories.get(userId).add(categoryId);
    }

    public Map<Integer, List<Integer>> getUsersAccessibleCategories() {
        return usersAccessibleCategories;
    }

    public String getCurrentLanguageId() {
        return currentLanguageId;
    }

    public Integer getCurrentUserId() {
        return currentUserId;
    }

}
