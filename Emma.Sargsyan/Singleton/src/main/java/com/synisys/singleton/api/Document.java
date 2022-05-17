package com.synisys.singleton.api;

/**
 * Created by emma.sargsyan
 */
public class Document {

	private Integer id;
	private String path;
	private String name;
	private String content;

	public Document(Integer id, String path, String name, String content) {
		this.id = id;
		this.path = path;
		this.name = name;
		this.content = content;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
