package synisys.trining.designPatterns;

import synisys.training.designPatterns.singleton.AppConfiguration;

/**
 * @author harut.arakelyan
 */
public class Application {

    public static void main(String[] args){
        for(int i=0; i<10; i ++){
            System.out.println(AppConfiguration.getInstance().configLoadTime);
        }
    }
}
