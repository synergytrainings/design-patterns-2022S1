package com.synisys.singleton;

import com.synisys.singleton.api.Document;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by emma.sargsyan
 */
public class InnerClassPlayer {

	private static class Loader {
		private static final InnerClassPlayer INSTANCE = new InnerClassPlayer();
	}

	private InnerClassPlayer() {
	}

	public static InnerClassPlayer getInstance() {
		return Loader.INSTANCE;
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
		System.out.println(document.getName() + " printed with Inner Class Player!");
	}

}
