package com.synisys.patterns.simplebulder.impl;


import com.synisys.patterns.bulder3.util.OperationType;
import com.synisys.patterns.bulder3.util.StringBuilderHelper;
import com.synisys.patterns.simplebulder.Query;

import java.util.HashMap;
import java.util.Map;

public class UpdateQuery extends Query {
    private final Map<String, String> wheres;
    private final Map<String, String> values;

    public static class Builder extends Query.Builder<Builder> {

        private Map<String, String> wheres = new HashMap<String, String>();
        private Map<String, String> values = new HashMap<>();

        public Builder(String table) {
            super(table);
            operationType(OperationType.UPDATE);

        }

        public Builder where(String column, String value) {
            wheres.put(column, value);
            return self();
        }

        public Builder values(String column, String value) {
            values.put(column, value);
            return self();
        }

        @Override
        public UpdateQuery build() {
            return new UpdateQuery(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private UpdateQuery(Builder builder) {
        super(builder);
        wheres = builder.wheres;
        values = builder.wheres;

    }

    @Override
    public String buildQuery() {
        StringBuilder sql = new StringBuilder("update ");

        sql.append(getTable());
        sql.append(" set ");

        StringBuilderHelper.appendMap(sql, values, " , ", " = ");
        sql.append(" where ");
        StringBuilderHelper.appendMap(sql, wheres, " and ", " = ");
        return sql.toString();
    }
}
