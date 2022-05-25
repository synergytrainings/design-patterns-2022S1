package test;

import main.Priority;
import main.Ticket;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

public class TicketBuilderTest {

    @Test
    public void testTicketBuilder() {
        Ticket.TicketBuilder bugBuilder = new Ticket.TicketBuilder();

        Ticket bug =  bugBuilder.summary("Can't save Activity")
                .priority(Priority.HIGHEST)
                .bug()
                .affectVersion("1.05")
                .associatedProject("indicata")
                .url("https://indicata.com")
                .build();

        assertEquals(bug.getAssociatedProject(), "indicata");

        Ticket.TicketBuilder investigationBuilder = new Ticket.TicketBuilder();
        Ticket investigation = investigationBuilder.summary("Elastic upgrade")
                .priority(Priority.MEDIUM)
                .story()
                .sprint("Azhdahak")
                .investigation()
                .investigationResult("Result")
                .build();
        assertNull(bug.getSprint());
        assertEquals(investigation.getInvestigationResult(), "Result");

    }

    @Test(expected = IllegalStateException.class)
    public void testTicketBuilderException() {
        Ticket.TicketBuilder storyBuilder = new Ticket.TicketBuilder();

        Ticket story = storyBuilder.story()
                .sprint("Azhdahak")
                .build();
    }

}
