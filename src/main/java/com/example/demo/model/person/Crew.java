package com.example.demo.model.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"department",
"job"
})
public class Crew extends Person {
	@JsonProperty("department")
	private String department;
	@JsonProperty("job")
	private String job;
	
	
	@JsonProperty("department")
	public String getDepartment() {
	return department;
	}

	@JsonProperty("department")
	public void setDepartment(String department) {
	this.department = department;
	}

	@JsonProperty("job")
	public String getJob() {
	return job;
	}

	@JsonProperty("job")
	public void setJob(String job) {
	this.job = job;
	}
	
}
