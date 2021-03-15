
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
    "id",
    "logo_path",
    "name",
    "origin_country"
})
public class ProductionCompany implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("logo_path")
    private Object logoPath;
    @JsonProperty("name")
    private String name;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3758871353810571051L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("logo_path")
    public Object getLogoPath() {
        return logoPath;
    }

    @JsonProperty("logo_path")
    public void setLogoPath(Object logoPath) {
        this.logoPath = logoPath;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("origin_country")
    public String getOriginCountry() {
        return originCountry;
    }

    @JsonProperty("origin_country")
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
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
        return new ToStringBuilder(this).append("id", id).append("logoPath", logoPath).append("name", name).append("originCountry", originCountry).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(originCountry).append(id).append(additionalProperties).append(logoPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductionCompany) == false) {
            return false;
        }
        ProductionCompany rhs = ((ProductionCompany) other);
        return new EqualsBuilder().append(name, rhs.name).append(originCountry, rhs.originCountry).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(logoPath, rhs.logoPath).isEquals();
    }

}
