package main.impl;

import main.api.MusicRecord;
import main.api.Performer;

public class ClassicalMusicRecord extends MusicRecord {
	String composer;

	public ClassicalMusicRecord(Performer performer, int year, String composer, String opera) {
		super(performer, opera, year);
		this.composer = composer;
	}
}
