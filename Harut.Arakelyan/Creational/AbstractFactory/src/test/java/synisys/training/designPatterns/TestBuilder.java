package synisys.training.designPatterns;

import org.junit.Test;
import synisys.training.designPatterns.abstractFactory.ApplicationFactory;
import synisys.training.designPatterns.abstractFactory.PaymentService;
import synisys.training.designPatterns.abstractFactory.api.Application;


/**
 * @author harut.arakelyan
 */

public class TestBuilder {

    @Test
    public void testAbstractFactory(){
        ApplicationFactory applicationFactory= new ApplicationFactory();
        Application  application = applicationFactory.createApplication("dental");
        if(PaymentService.validateApplication(application)){
            PaymentService.payApplication(application);
        }

    }
}
