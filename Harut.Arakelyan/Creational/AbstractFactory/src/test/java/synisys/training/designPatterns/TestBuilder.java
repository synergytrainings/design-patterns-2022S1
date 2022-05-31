package synisys.training.designPatterns;

import org.junit.Test;
import synisys.training.designPatterns.abstractFactory.api.Application;
import synisys.training.designPatterns.abstractFactory.impl.ApplicationFactory;


/**
 * @author harut.arakelyan
 */

public class TestBuilder {

    @Test
    public void testAbstractFactory(){
        ApplicationFactory applicationFactory= new ApplicationFactory();
        Application  application = applicationFactory.createApplication("dental");
        application.pay();

    }
}
