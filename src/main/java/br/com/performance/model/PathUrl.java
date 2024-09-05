package br.com.performance.model;

public class PathUrl {

	private String url;
	private String path;
	private String content;
	private String response;
	
	
	public PathUrl(String url, String path, String response) {
		this.url = url;
		this.path = path;
		this.response = response;
	}

	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return getPath()+"/"+getContent()+"/"+getResponse();
	}
	
}
