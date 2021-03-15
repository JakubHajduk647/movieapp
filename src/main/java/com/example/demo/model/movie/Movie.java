
package com.example.demo.model.movie;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "adult",
    "backdrop_path",
    "belongs_to_collection",
    "budget",
    "genres",
    "homepage",
    "id",
    "imdb_id",
    "original_language",
    "original_title",
    "overview",
    "popularity",
    "poster_path",
    "production_companies",
    "production_countries",
    "release_date",
    "revenue",
    "runtime",
    "spoken_languages",
    "status",
    "tagline",
    "title",
    "video",
    "vote_average",
    "vote_count"
})
public class Movie implements Serializable
{

    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private Object backdropPath;
    @JsonProperty("belongs_to_collection")
    private Object belongsToCollection;
    @JsonProperty("budget")
    private Integer budget;
    @JsonProperty("genres")
    private List<Genre> genres = null;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanies = null;
    @JsonProperty("production_countries")
    private List<ProductionCountry> productionCountries = null;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("revenue")
    private Integer revenue;
    @JsonProperty("runtime")
    private Integer runtime;
    @JsonProperty("spoken_languages")
    private List<SpokenLanguage> spokenLanguages = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 978602787754621989L;

    @JsonProperty("adult")
    public Boolean getAdult() {
        return adult;
    }

    @JsonProperty("adult")
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    @JsonProperty("backdrop_path")
    public Object getBackdropPath() {
        return backdropPath;
    }

    @JsonProperty("backdrop_path")
    public void setBackdropPath(Object backdropPath) {
        this.backdropPath = backdropPath;
    }

    @JsonProperty("belongs_to_collection")
    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    @JsonProperty("belongs_to_collection")
    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    @JsonProperty("budget")
    public Integer getBudget() {
        return budget;
    }

    @JsonProperty("budget")
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @JsonProperty("genres")
    public List<Genre> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("imdb_id")
    public String getImdbId() {
        return imdbId;
    }

    @JsonProperty("imdb_id")
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    @JsonProperty("original_language")
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    @JsonProperty("original_language")
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    @JsonProperty("original_title")
    public String getOriginalTitle() {
        return originalTitle;
    }

    @JsonProperty("original_title")
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("poster_path")
    public String getPosterPath() {
        return posterPath;
    }

    @JsonProperty("poster_path")
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @JsonProperty("production_companies")
    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    @JsonProperty("production_companies")
    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    @JsonProperty("production_countries")
    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }

    @JsonProperty("production_countries")
    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("revenue")
    public Integer getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("runtime")
    public Integer getRuntime() {
        return runtime;
    }

    @JsonProperty("runtime")
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @JsonProperty("spoken_languages")
    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }

    @JsonProperty("spoken_languages")
    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    @JsonProperty("vote_average")
    public Double getVoteAverage() {
        return voteAverage;
    }

    @JsonProperty("vote_average")
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    @JsonProperty("vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    @JsonProperty("vote_count")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
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
        return new ToStringBuilder(this).append("adult", adult).append("backdropPath", backdropPath).append("belongsToCollection", belongsToCollection).append("budget", budget).append("genres", genres).append("homepage", homepage).append("id", id).append("imdbId", imdbId).append("originalLanguage", originalLanguage).append("originalTitle", originalTitle).append("overview", overview).append("popularity", popularity).append("posterPath", posterPath).append("productionCompanies", productionCompanies).append("productionCountries", productionCountries).append("releaseDate", releaseDate).append("revenue", revenue).append("runtime", runtime).append("spokenLanguages", spokenLanguages).append("status", status).append("tagline", tagline).append("title", title).append("video", video).append("voteAverage", voteAverage).append("voteCount", voteCount).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imdbId).append(video).append(title).append(productionCountries).append(revenue).append(genres).append(popularity).append(id).append(budget).append(posterPath).append(overview).append(voteAverage).append(releaseDate).append(belongsToCollection).append(runtime).append(originalLanguage).append(originalTitle).append(tagline).append(spokenLanguages).append(backdropPath).append(voteCount).append(additionalProperties).append(adult).append(productionCompanies).append(homepage).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Movie) == false) {
            return false;
        }
        Movie rhs = ((Movie) other);
        return new EqualsBuilder().append(imdbId, rhs.imdbId).append(video, rhs.video).append(title, rhs.title).append(productionCountries, rhs.productionCountries).append(revenue, rhs.revenue).append(genres, rhs.genres).append(popularity, rhs.popularity).append(id, rhs.id).append(budget, rhs.budget).append(posterPath, rhs.posterPath).append(overview, rhs.overview).append(voteAverage, rhs.voteAverage).append(releaseDate, rhs.releaseDate).append(belongsToCollection, rhs.belongsToCollection).append(runtime, rhs.runtime).append(originalLanguage, rhs.originalLanguage).append(originalTitle, rhs.originalTitle).append(tagline, rhs.tagline).append(spokenLanguages, rhs.spokenLanguages).append(backdropPath, rhs.backdropPath).append(voteCount, rhs.voteCount).append(additionalProperties, rhs.additionalProperties).append(adult, rhs.adult).append(productionCompanies, rhs.productionCompanies).append(homepage, rhs.homepage).append(status, rhs.status).isEquals();
    }

}
