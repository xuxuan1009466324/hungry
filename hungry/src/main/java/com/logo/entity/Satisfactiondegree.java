package com.logo.entity;

public class Satisfactiondegree {

	private Long satisfactionDegreeId;
	private String satisfactionDegreeName;
	private Long getSatisfactionDegreeId() {
		return satisfactionDegreeId;
	}
	public void setSatisfactionDegreeId(Long satisfactionDegreeId) {
		this.satisfactionDegreeId = satisfactionDegreeId;
	}
	public String getSatisfactionDegreeName() {
		return satisfactionDegreeName;
	}
	public void setSatisfactionDegreeName(String satisfactionDegreeName) {
		this.satisfactionDegreeName = satisfactionDegreeName;
	}
	@Override
	public String toString() {
		return "Satisfactiondegree [satisfactionDegreeId=" + satisfactionDegreeId + ", satisfactionDegreeName="
				+ satisfactionDegreeName + "]";
	}
}
