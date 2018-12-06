package com.cg.module2test.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="query_master")
public class ForumBean {
	@Id
	private int query_id;
	private String technology;
	private String query_raised_by;
	private String query;
	private String solutions;
	private String solution_given_by;

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQuery_raised_by() {
		return query_raised_by;
	}

	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolution_given_by() {
		return solution_given_by;
	}

	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}

}
