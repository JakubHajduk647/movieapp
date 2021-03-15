
package com.example.demo.model.movie;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "english_name",
    "iso_639_1",
    "name"
})
public class SpokenLanguage implements Serializable
{

    @JsonProperty("english_name")
    private String englishName;
    @JsonProperty("iso_639_1")
    private String iso6391;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4593051497598872255L;

    @JsonProperty("english_name")
    public String getEnglishName() {
        return englishName;
    }

    @JsonProperty("english_name")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @JsonProperty("iso_639_1")
    public String getIso6391() {
        return iso6391;
    }

    @JsonProperty("iso_639_1")
    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        return new ToStringBuilder(this).append("englishName", englishName).append("iso6391", iso6391).append("name", name).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(englishName).append(iso6391).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpokenLanguage) == false) {
            return false;
        }
        SpokenLanguage rhs = ((SpokenLanguage) other);
        return new EqualsBuilder().append(name, rhs.name).append(englishName, rhs.englishName).append(iso6391, rhs.iso6391).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
