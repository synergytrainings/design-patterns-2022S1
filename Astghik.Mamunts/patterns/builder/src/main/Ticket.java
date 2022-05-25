package main;

import java.util.Objects;

public class Ticket {

    private String summary;

    private String description;

    private Priority priority;

    private String affectVersion;

    private String associatedProject;

    private String url;

    private String sprint;

    private String investigationResult;

    private Ticket(String summary, String description, Priority priority, String affectVersion, String associatedProject, String url, String sprint, String investigationResult) {
        this.summary = summary;
        this.description = description;
        this.priority = priority;
        this.affectVersion = affectVersion;
        this.associatedProject = associatedProject;
        this.url = url;
        this.sprint = sprint;
        this.investigationResult = investigationResult;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getAffectVersion() {
        return affectVersion;
    }

    public String getAssociatedProject() {
        return associatedProject;
    }

    public String getUrl() {
        return url;
    }

    public String getSprint() {
        return sprint;
    }

    public String getInvestigationResult() {
        return investigationResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(summary, ticket.summary) && Objects.equals(description, ticket.description) && priority == ticket.priority && Objects.equals(affectVersion, ticket.affectVersion) && Objects.equals(associatedProject, ticket.associatedProject) && Objects.equals(url, ticket.url) && Objects.equals(sprint, ticket.sprint) && Objects.equals(investigationResult, ticket.investigationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, description, priority, affectVersion, associatedProject, url, sprint, investigationResult);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", affectVersion='" + affectVersion + '\'' +
                ", associatedProject='" + associatedProject + '\'' +
                ", url='" + url + '\'' +
                ", sprint='" + sprint + '\'' +
                ", investigationResult='" + investigationResult + '\'' +
                '}';
    }

    public static class TicketBuilder {

        private String summary;

        private String description;

        private Priority priority;

        private TicketType ticketType;

        public TicketBuilder() {
        }

        public TicketBuilder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public TicketBuilder priority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TicketBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BugBuilder bug() {
            validate();
            this.ticketType = TicketType.BUG;
            return new BugBuilder(this);
        }

        public StoryBuilder story() {
            validate();
            this.ticketType = TicketType.STORY;
            return new StoryBuilder(this);
        }

        public InvestigationBuilder investigation() {
            validate();
            this.ticketType = TicketType.INVESTIGATION;
            return new InvestigationBuilder(this);
        }

        private void validate() {
            if (summary == null || summary.isEmpty()) {
                throw new IllegalStateException("Summary can't be null or empty!");
            }
            if (priority == null) {
                throw new IllegalStateException("Priority can't be null!");
            }
        }
    }

    public static class BugBuilder {

        private TicketBuilder ticketBuilder;

        private String affectVersion;

        private String associatedProject;

        private String url;

        private TicketType ticketType;

        public BugBuilder(TicketBuilder ticketBuilder) {
           this.ticketBuilder = ticketBuilder;
        }

        public BugBuilder affectVersion(String affectVersion) {
            this.affectVersion = affectVersion;
            return this;
        }

        public BugBuilder associatedProject(String associatedProject) {
            this.associatedProject = associatedProject;
            return this;
        }

        public BugBuilder url(String url) {
            this.url = url;
            return this;
        }

        public StoryBuilder story() {
            this.ticketType = TicketType.STORY;
            return new StoryBuilder(ticketBuilder);
        }

        public Ticket build() {
            validate();
            return new Ticket(ticketBuilder.summary, ticketBuilder.description, ticketBuilder.priority, affectVersion, associatedProject, url, null, null);
        }

        private void validate() {
            if (affectVersion == null || affectVersion.isEmpty()) {
                throw new IllegalStateException("Affect version can't be null or empty!");
            }
            if (associatedProject == null || associatedProject.isEmpty()) {
                throw new IllegalStateException("Associated Project can't be null or empty!");
            }
            if (url == null || url.isEmpty()) {
                throw new IllegalStateException("URL can't be null or empty!");
            }
        }
    }

    public static class StoryBuilder {

        private TicketBuilder ticketBuilder;

        private String sprint;

        private TicketType ticketType;

        public StoryBuilder(TicketBuilder ticketBuilder) {
            this.ticketBuilder = ticketBuilder;
        }

        public StoryBuilder sprint(String sprint) {
            this.sprint = sprint;
            return this;
        }

        public InvestigationBuilder investigation() {
            this.ticketType = TicketType.INVESTIGATION;
            return new InvestigationBuilder(ticketBuilder);
        }

        public Ticket build() {
            validate();
            return new Ticket(ticketBuilder.summary, ticketBuilder.description, ticketBuilder.priority, null, null, null, sprint, null);
        }

        private void validate() {
            if (sprint == null || sprint.isEmpty()) {
                throw new IllegalStateException("Sprint can't be null or empty!");
            }
        }
    }

    public static class InvestigationBuilder {

        private TicketBuilder ticketBuilder;

        private String investigationResult;

        private TicketType ticketType;

        public InvestigationBuilder(TicketBuilder ticketBuilder) {
            this.ticketBuilder = ticketBuilder;
        }

        public InvestigationBuilder investigationResult(String investigationResult) {
            this.investigationResult = investigationResult;
            return this;
        }

        public Ticket build() {
            return new Ticket(ticketBuilder.summary, ticketBuilder.description, ticketBuilder.priority, null, null, null, null, investigationResult);
        }

    }
}
