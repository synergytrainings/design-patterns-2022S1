package com.synisys.singleton;

import com.synisys.singleton.api.Document;
import java.util.LinkedList;
import java.util.Queue;

public enum PlayerEnum {
	INSTANCE;

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
		System.out.println(document.getName() + " printed with Player Enum!");
	}

}
