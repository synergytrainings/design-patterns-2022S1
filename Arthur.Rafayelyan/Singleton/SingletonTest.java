package Arthur.Rafayelyan.Singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    public static List<String> items = new ArrayList<>();

    @BeforeAll
    public static void createArrayWithItems() {
        items.add("Samsung S21+");
        items.add("Iphone 13 Pro Max");
    }

    @Test
    @DisplayName("Testing Eager Initialized Store")
    public void testEagerInitializedStore() {
        EagerInitializedStore mobileCenter = EagerInitializedStore.getInstance();
        mobileCenter.addItem("Samsung S21+");
        EagerInitializedStore iStore = EagerInitializedStore.getInstance();
        iStore.addItem("Iphone 13 Pro Max");

        assertEquals(mobileCenter.hashCode(),iStore.hashCode());
        assertEquals(items,mobileCenter.getItems());
        assertEquals(items,iStore.getItems());
    }

    @Test
    @DisplayName("Testing Lazy Initialized Store")
    public void testLazyInitializedStore() {
        LazyInitializedStore mobileCenter = LazyInitializedStore.getInstance();
        mobileCenter.addItem("Samsung S21+");
        LazyInitializedStore iStore = LazyInitializedStore.getInstance();
        iStore.addItem("Iphone 13 Pro Max");

        assertEquals(mobileCenter.hashCode(),iStore.hashCode());
        assertEquals(items,mobileCenter.getItems());
        assertEquals(items,iStore.getItems());
    }

    @Test
    @DisplayName("Testing Enum Store")
    public void testEnumStore() {
        EnumStore mobileCenter = EnumStore.INSTANCE;
        mobileCenter.addItem("Samsung S21+");
        EnumStore iStore = EnumStore.INSTANCE;
        iStore.addItem("Iphone 13 Pro Max");

        assertEquals(mobileCenter.hashCode(),iStore.hashCode());
        assertEquals(items,mobileCenter.getItems());
        assertEquals(items,iStore.getItems());
    }


    @Test
    @DisplayName("Testing Serializable Store")
    public void testSerializableStore() {
        SerializableStore mobileCenter = SerializableStore.instance;
        mobileCenter.addItem("Samsung S21+");


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("store.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(mobileCenter);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        mobileCenter.addItem("Iphone 13 Pro Max");
        SerializableStore serializableStore = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("store.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            serializableStore = (SerializableStore) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(mobileCenter,serializableStore);
        assertEquals(items,serializableStore.getItems());

    }


    @Test
    @DisplayName("Test destroying singlton using reflection")
    public void testDestroyingSingtonClassesUsingReflection() {
        EagerInitializedStore instanceOne = EagerInitializedStore.getInstance();
        EagerInitializedStore instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedStore.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedStore) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotEquals(instanceOne.hashCode(),instanceTwo.hashCode());

    }

}
