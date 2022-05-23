package com.synisys.patterns.simplebulder.impl;


import com.synisys.patterns.bulder3.util.OperationType;
import com.synisys.patterns.bulder3.util.StringBuilderHelper;
import com.synisys.patterns.simplebulder.Query;

import java.util.*;

public class SelectQuery extends Query {
    private final List<String> columns;
    private final List<String> orderBys;
    private final List<String> groupBys;
    private final Map<String, String> wheres;

    public static class Builder extends Query.Builder<Builder> {

        private List<String> columns = new ArrayList<String>();
        private List<String> orderBys = new ArrayList<String>();
        private List<String> groupBys = new ArrayList<String>();
        private Map<String, String> wheres = new HashMap<String, String>();

        public Builder(String table) {
            super(table);
            operationType(OperationType.SELECT);
        }


        public Builder column(String columnName) {
            this.columns.add(columnName);
            return self();
        }

        public Builder groupBy(String groupBy) {
            groupBys.add(groupBy);
            return self();
        }

        public Builder orderBy(String orderBy) {
            orderBys.add(orderBy);
            return self();
        }

        public Builder where(String column, String value) {
            wheres.put(column, value);
            return self();
        }

        @Override
        public SelectQuery build() {
            return new SelectQuery(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private SelectQuery(Builder builder) {
        super(builder);
        columns = builder.columns;
        orderBys = builder.orderBys;
        groupBys = builder.groupBys;
        wheres = builder.wheres;

    }

    @Override
    public String buildQuery() {
        StringBuilder sql = new StringBuilder("select ");

        if (columns.size() == 0) {
            sql.append("*");
        } else {
            StringBuilderHelper.appendList(sql, columns, ", ");
        }

        StringBuilderHelper.appendList(sql, Collections.singletonList(getTable()), " from  ", "");
        if (!wheres.isEmpty()) {
            sql.append(" where ");
            StringBuilderHelper.appendMap(sql, wheres, " and ", " = ");
        }
        if (!groupBys.isEmpty()) {
            StringBuilderHelper.appendList(sql, groupBys, " group by ", ", ");
        }
        if (!orderBys.isEmpty()){
            StringBuilderHelper.appendList(sql, orderBys, " order by ", ", ");
        }

        return sql.toString();    }
}
