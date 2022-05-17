package com.synisys.singleton;

import com.synisys.singleton.api.Document;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by emma.sargsyan
 */
public class PlayerStaticFactory implements Serializable {

	private static final PlayerStaticFactory INSTANCE = new PlayerStaticFactory();

	public static PlayerStaticFactory getInstance() {
		return INSTANCE;
	}

	private PlayerStaticFactory() {
		if (INSTANCE != null) {
			throw new IllegalStateException("Already instantiated !!!");
		}
	}

	private Object readResolve() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private Queue<Document> documents = new LinkedList<>();

	/**
	 * Add new document in queue for printing
	 * @param document
	 */
	public void addDocumentForPrint(Document document) {
		documents.add(document);
	}

	/**
	 * Print first document from queue
	 */
	public void printDocument() {
		Document document = documents.poll();
		System.out.println(document.getName() + " printed with Player Static Factory!");
	}

}