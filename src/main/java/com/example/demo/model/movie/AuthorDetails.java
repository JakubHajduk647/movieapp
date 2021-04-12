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
@JsonPropertyOrder({ "name", "username", "avatar_path", "rating" })
@Generated("jsonschema2pojo")
public class AuthorDetails {

	@JsonProperty("name")
	private String name;
	@JsonProperty("username")
	private String username;
	@JsonProperty("avatar_path")
	private Object avatarPath;
	@JsonProperty("rating")
	private Integer rating;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("avatar_path")
	public Object getAvatarPath() {
		return avatarPath;
	}

	@JsonProperty("avatar_path")
	public void setAvatarPath(Object avatarPath) {
		this.avatarPath = avatarPath;
	}

	@JsonProperty("rating")
	public Integer getRating() {
		return rating;
	}

	@JsonProperty("rating")
	public void setRating(Integer rating) {
		this.rating = rating;
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
		sb.append(AuthorDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("username");
		sb.append('=');
		sb.append(((this.username == null) ? "<null>" : this.username));
		sb.append(',');
		sb.append("avatarPath");
		sb.append('=');
		sb.append(((this.avatarPath == null) ? "<null>" : this.avatarPath));
		sb.append(',');
		sb.append("rating");
		sb.append('=');
		sb.append(((this.rating == null) ? "<null>" : this.rating));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}
}