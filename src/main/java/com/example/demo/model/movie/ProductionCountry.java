
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
    "iso_3166_1",
    "name"
})
public class ProductionCountry implements Serializable
{

    @JsonProperty("iso_3166_1")
    private String iso31661;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4779689502962574245L;

    @JsonProperty("iso_3166_1")
    public String getIso31661() {
        return iso31661;
    }

    @JsonProperty("iso_3166_1")
    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
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
        return new ToStringBuilder(this).append("iso31661", iso31661).append("name", name).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(iso31661).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductionCountry) == false) {
            return false;
        }
        ProductionCountry rhs = ((ProductionCountry) other);
        return new EqualsBuilder().append(name, rhs.name).append(iso31661, rhs.iso31661).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
