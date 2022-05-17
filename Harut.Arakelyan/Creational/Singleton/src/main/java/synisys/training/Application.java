package synisys.training;

import synisys.training.designPatterns.singleton.AppConfiguration;
import synisys.training.designPatterns.singleton.ThreadTest;

import java.util.Date;

/**
 * @author harut.arakelyan
 */
public class Application {

    public static void main(String[] args){
        /*for(int i=0; i<1000; i ++){
            System.out.println(AppConfiguration.getInstance().configLoadTime);
        }*/
        ThreadTest T1 = new ThreadTest( "Thread-1");
        ThreadTest T2 = new ThreadTest( "Thread-2");
        T2.start();
        T1.start();

    }
}
