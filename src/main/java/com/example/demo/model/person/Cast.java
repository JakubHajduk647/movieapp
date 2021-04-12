package com.example.demo.model.person;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cast extends Person{
	
	@JsonProperty("character")
	private String character;
	@JsonProperty("order")
	private Integer order;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	

	@JsonProperty("character")
	public String getCharacter() {
	return character;
	}

	@JsonProperty("character")
	public void setCharacter(String character) {
	this.character = character;
	}
	@JsonProperty("order")
	public Integer getOrder() {
	return order;
	}

	@JsonProperty("order")
	public void setOrder(Integer order) {
	this.order = order;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
