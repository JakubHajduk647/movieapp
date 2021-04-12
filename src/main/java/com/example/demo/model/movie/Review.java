package com.example.demo.model.movie;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"author",
"author_details",
"content",
"created_at",
"id",
"updated_at",
"url"
})
@Generated("jsonschema2pojo")
public class Review {
	@JsonProperty("author")
	private String author;
	@JsonProperty("author_details")
	private AuthorDetails authorDetails;
	@JsonProperty("content")
	private String content;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("id")
	private String id;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("author")
	public String getAuthor() {
	return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
	this.author = author;
	}

	@JsonProperty("author_details")
	public AuthorDetails getAuthorDetails() {
	return authorDetails;
	}

	@JsonProperty("author_details")
	public void setAuthorDetails(AuthorDetails authorDetails) {
	this.authorDetails = authorDetails;
	}

	@JsonProperty("content")
	public String getContent() {
	return content;
	}

	@JsonProperty("content")
	public void setContent(String content) {
	this.content = content;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
	return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
	}

	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
	return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
	}

	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(Review.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
	sb.append("author");
	sb.append('=');
	sb.append(((this.author == null)?"<null>":this.author));
	sb.append(',');
	sb.append("authorDetails");
	sb.append('=');
	sb.append(((this.authorDetails == null)?"<null>":this.authorDetails));
	sb.append(',');
	sb.append("content");
	sb.append('=');
	sb.append(((this.content == null)?"<null>":this.content));
	sb.append(',');
	sb.append("createdAt");
	sb.append('=');
	sb.append(((this.createdAt == null)?"<null>":this.createdAt));
	sb.append(',');
	sb.append("id");
	sb.append('=');
	sb.append(((this.id == null)?"<null>":this.id));
	sb.append(',');
	sb.append("updatedAt");
	sb.append('=');
	sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
	sb.append(',');
	sb.append("url");
	sb.append('=');
	sb.append(((this.url == null)?"<null>":this.url));
	sb.append(',');
	sb.append("additionalProperties");
	sb.append('=');
	sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
	sb.append(',');
	if (sb.charAt((sb.length()- 1)) == ',') {
	sb.setCharAt((sb.length()- 1), ']');
	} else {
	sb.append(']');
	}
	return sb.toString();
	}


}
