package com.synisys.patterns.simplebulder.impl;


import com.synisys.patterns.bulder3.util.OperationType;
import com.synisys.patterns.bulder3.util.StringBuilderHelper;
import com.synisys.patterns.simplebulder.Query;

import java.util.HashMap;
import java.util.Map;


public class DeleteQuery extends Query {
    private final Map<String, String> wheres;

    public static class Builder extends Query.Builder<Builder> {

        private Map<String, String> wheres = new HashMap<String, String>();

        public Builder(String table) {
            super(table);
            operationType(OperationType.DELETE);
        }

        public Builder where(String column, String value) {
            wheres.put(column, value);
            return self();
        }

        @Override
        public DeleteQuery build() {
            return new DeleteQuery(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    private DeleteQuery(Builder builder) {
        super(builder);
        wheres = builder.wheres;

    }

    @Override
    public String buildQuery() {
        StringBuilder sql = new StringBuilder("delete from ");
        sql.append(getTable());
        if (!wheres.isEmpty()) {
            sql.append(" where ");
            StringBuilderHelper.appendMap(sql, wheres, " and ", " = ");
        }
        return sql.toString();
    }

}
