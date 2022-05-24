package main.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

@SuppressWarnings("unchecked")
public class Email extends Notification {
    private ArrayList<String> cc;
    private String subject;

    private Email(FinalBuilder builder) {
        super(builder);
        cc = (ArrayList<String>) builder.cc.clone();
        subject = builder.subject;
    }

    private Email(Builder builder) {
        super(builder);
    }

    public static class Builder extends Notification.Builder<FinalBuilder> {
        private final FinalBuilder finalBuilder;

        public Builder(String from, String to) {
            super(from, to);
            finalBuilder = new FinalBuilder(getFrom(), getTo());
        }

        @Override
        public FinalBuilder sendNow(boolean sendNow) {
            finalBuilder.setSendNow(sendNow);
            return super.sendNow(sendNow);
        }

        @Override
        public FinalBuilder sendingDate(LocalDate sendingDate) {
            finalBuilder.setSendingDate(sendingDate);
            return super.sendingDate(sendingDate);
        }

        @Override
        public Email build() {
            return new Email(this);
        }

        @Override
        protected FinalBuilder self() {
            return finalBuilder;
        }
    }

    public static class FinalBuilder extends Notification.FinalBuilder<FinalBuilder> {
        private final ArrayList<String> cc = new ArrayList<>();
        private String subject;

        public FinalBuilder(String from, String to) {
            super(from, to);
        }

        public FinalBuilder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return self();
        }

        public FinalBuilder cc(String cc) {
            this.cc.add(cc);
            return self();
        }

        public FinalBuilder ccAll(String... cc) {
            this.cc.addAll(Arrays.asList(cc));
            return self();
        }

        @Override
        public Email build() {
            return new Email(this);
        }

        @Override
        protected FinalBuilder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Email{" +
                "cc=" + cc +
                ", subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", content='" + content + '\'' +
                ", sendNow=" + sendNow +
                ", sendingDate=" + sendingDate +
                '}';
    }
}
