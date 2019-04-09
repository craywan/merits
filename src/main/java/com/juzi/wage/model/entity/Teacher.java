package com.juzi.wage.model.entity;

public class Teacher {
    private String jobNumber;

    private String department;

    private String name;

    private String jobProperty;

    private String jobLevel;

    private String workMonth;

    private String jobCoefficient;

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getJobProperty() {
        return jobProperty;
    }

    public void setJobProperty(String jobProperty) {
        this.jobProperty = jobProperty == null ? null : jobProperty.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getWorkMonth() {
        return workMonth;
    }

    public void setWorkMonth(String workMonth) {
        this.workMonth = workMonth == null ? null : workMonth.trim();
    }

    public String getJobCoefficient() {
        return jobCoefficient;
    }

    public void setJobCoefficient(String jobCoefficient) {
        this.jobCoefficient = jobCoefficient == null ? null : jobCoefficient.trim();
    }
}