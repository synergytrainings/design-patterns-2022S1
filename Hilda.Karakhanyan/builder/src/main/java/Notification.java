package main.java;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Notification {
    public String from;
    public String to;
    public String content;
    public boolean sendNow;
    public LocalDate sendingDate;

    Notification(FinalBuilder<?> builder) {
        this.from = Objects.requireNonNull(builder.from);
        this.to = Objects.requireNonNull(builder.to);
        this.content = builder.content;
        this.sendingDate = builder.sendingDate;
        this.sendNow = builder.sendNow;
    }

    Notification(Builder<?> builder) {
        this.sendingDate = builder.sendingDate;
        this.sendNow = builder.sendNow;
    }

    abstract static class Builder<T extends FinalBuilder<T>> {

        private boolean sendNow;
        private LocalDate sendingDate;
        private final String from;
        private final String to;

        public Builder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public T sendNow(boolean sendNow) {
            this.sendNow = sendNow;
            return self();
        }

        public T sendingDate(LocalDate sendingDate) {
            this.sendingDate = sendingDate;
            return self();
        }

        protected abstract T self();

        protected abstract Notification build();

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }
    }

    abstract static class FinalBuilder<S extends FinalBuilder<S>> {
        private boolean sendNow;

        private LocalDate sendingDate;
        private final String from;
        private final String to;
        private String content;

        public FinalBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public S content(String content) {
            this.content = content;
            return self();
        }

        protected abstract S self();

        protected abstract Notification build();

        public void setSendNow(boolean sendNow) {
            this.sendNow = sendNow;
        }

        public void setSendingDate(LocalDate sendingDate) {
            this.sendingDate = sendingDate;
        }
    }
}
