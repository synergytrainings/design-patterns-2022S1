package com.synisys.patterns.simplebulder;


import com.synisys.patterns.bulder3.util.OperationType;


public abstract class Query {
    private String table;
    private OperationType operationType;

    public abstract static class Builder<T extends Builder<T>>{
        private String table;
        private OperationType operationType;

        public Builder(String table) {
            this.table = table;
        }
        public T operationType(OperationType operationType) {
            this.operationType = operationType;
            return self();
        }

        protected abstract Query build();

        protected abstract T self();
    }

     public Query(Builder<?> builder) {
        table = builder.table;
        operationType = builder.operationType;
    }

    public abstract String buildQuery ();

    public String getTable() {
        return table;
    }
}

