package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Record {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	private LocalDateTime datetime;
	private String name;
	private String contents;
	private String feeling;

	public Record(String name, String feeling, String contents) {
		super();
		this.name = name;
		this.contents = contents;
		this.feeling = feeling;
		this.datetime = LocalDateTime.now();
	}

	public String getDatetime() {
		return datetime.format(fmt);
	}

	public String getName() {
		return name;
	}
	
	public String getFeeling() {
		return feeling;
	}

	public String getContents() {
		return contents.replaceAll("\n", "<br>");
	}
}