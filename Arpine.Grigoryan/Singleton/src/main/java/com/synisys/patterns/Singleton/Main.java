package com.synisys.patterns.Singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Lazy init
        assertEquals(DbConfig.config().hashCode(), DbConfig.config().hashCode());

        //Static block impl with Exception
        try {
            ElasticConfig elConfig = ElasticConfig.getInstance();
        } catch (Error ex) {
            System.out.println(" Static block ex " + ex.getMessage());
        }

        //Serializable Singleton
        RabbitConfig rabbitConfig = RabbitConfig.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));

        out.writeObject(rabbitConfig);
        RabbitConfig deserialized = (RabbitConfig) in.readObject();
        in.close();
        out.close();

        // without readResolve function
        // assertNotEquals(rabbitConfig.hashCode(), deserialized.hashCode());
        //with readResolve function
        assertEquals(rabbitConfig.hashCode(), deserialized.hashCode());


        //SystemConfigHelper class is not loaded into memory and only when someone calls the getInstance method
        SystemConfig.classState();

        System.out.println("----Init SystemConfig instance---- ");
        SystemConfig.getInstance();
    }

}
