package com.example.demo.model.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.example.demo.model.person.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"cast",
"crew"
})
@Generated("jsonschema2pojo")
public class Credits {

@JsonProperty("id")
private Integer id;
@JsonProperty("cast")
private ArrayList<Cast> cast = null;
@JsonProperty("crew")
private ArrayList<Crew> crew = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("cast")
public ArrayList<Cast> getCast() {
return cast;
}

@JsonProperty("cast")
public void setCast(ArrayList<Cast> cast) {
this.cast = cast;
}

@JsonProperty("crew")
public ArrayList<Crew> getCrew() {
return crew;
}

@JsonProperty("crew")
public void setCrew(ArrayList<Crew> crew) {
this.crew = crew;
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