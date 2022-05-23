package com.synisys.patterns.simplebulder;


import com.synisys.patterns.simplebulder.impl.DeleteQuery;
import com.synisys.patterns.simplebulder.impl.SelectQuery;
import com.synisys.patterns.simplebulder.impl.UpdateQuery;

public class Main {

    public static void main(String[] args) {
        DeleteQuery delete = new DeleteQuery.Builder("Users").where("userid" , "19").build();
        System.out.println(delete.buildQuery());


        SelectQuery select = new SelectQuery.Builder("User").column("userId").column("login")
                .where("email", "ahsh@asjjs.com").where("firstName", "ajjsa").build();
        System.out.println(select.buildQuery());


        UpdateQuery update = new UpdateQuery.Builder("User").values("firstName", "aaaa")
                .values("lastName", "bb")
                .where("id", "1").build();
        System.out.println(update.buildQuery());

    }
}
