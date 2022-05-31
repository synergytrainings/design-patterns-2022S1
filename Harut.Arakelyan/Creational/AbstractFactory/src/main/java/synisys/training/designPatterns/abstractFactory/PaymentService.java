package synisys.training.designPatterns.abstractFactory;

import synisys.training.designPatterns.abstractFactory.api.Application;

/**
 * @author harut.arakelyan
 */
public class PaymentService {

    public static boolean validateApplication(Application app){
        //do something
        return Math.round(Math.random()*100)%2 == 0;
    }

    public static void payApplication(Application app){
        System.out.println("Paid");
    }
}
