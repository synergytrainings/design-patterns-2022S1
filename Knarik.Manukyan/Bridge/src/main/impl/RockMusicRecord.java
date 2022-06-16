package main.impl;

import main.api.MusicRecord;
import main.api.Performer;

public class RockMusicRecord extends MusicRecord {
	String producer;
	String album;

	public RockMusicRecord(Performer performer, String name, int year, String producer, String album) {
		super(performer, name, year);
		this.producer = producer;
		this.album = album;
	}
}
