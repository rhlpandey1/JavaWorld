package org.gfk.pojos;

public class Employees {
    private String employeeName;
    private long empCode;
    private String orgName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmpCode() {
        return empCode;
    }

    public void setEmpCode(long empCode) {
        this.empCode = empCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeName='" + employeeName + '\'' +
                ", empCode=" + empCode +
                ", orgName='" + orgName + '\'' +
                '}';
    }

}
