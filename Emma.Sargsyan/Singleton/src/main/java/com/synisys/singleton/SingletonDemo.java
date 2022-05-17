package com.synisys.singleton;

import com.synisys.singleton.api.Document;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by emma.sargsyan
 */
public class SingletonDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Singleton implementation via enum
		PlayerEnum playerEnum = PlayerEnum.INSTANCE;
		playerEnum.addDocumentForPrint(new Document(1, "Path","PlayerEnum 1", "Content"));
		playerEnum.addDocumentForPrint(new Document(2, "Path","PlayerEnum 2", "Content"));
		playerEnum.printDocument();
		playerEnum.printDocument();


		// Singleton implementation via early loading static factory
		PlayerStaticFactory playerStaticFactory = PlayerStaticFactory.getInstance();

		try {
			Constructor[] constructors = PlayerStaticFactory.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.txt"));
		out.writeObject(playerStaticFactory);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.txt"));
		PlayerStaticFactory newPlayerStaticFactory = (PlayerStaticFactory) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode =" + playerStaticFactory.hashCode());
		System.out.println("newPlayerStaticFactory hashCode = " + newPlayerStaticFactory.hashCode());

		playerStaticFactory.addDocumentForPrint(new Document(3, "Path","PlayerStaticFactory 1", "Content"));
		playerStaticFactory.addDocumentForPrint(new Document(4, "Path","PlayerStaticFactory 2", "Content"));
		playerStaticFactory.printDocument();


		// Singleton implementation via inner class
		InnerClassPlayer innerClassPlayer = InnerClassPlayer.getInstance();
		innerClassPlayer.addDocumentForPrint(new Document(5, "Path","InnerClassPlayer 1", "Content"));
		innerClassPlayer.addDocumentForPrint(new Document(6, "Path","InnerClassPlayer 2", "Content"));
		innerClassPlayer.printDocument();

	}

}
