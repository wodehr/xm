package hr.entity;

import java.math.BigDecimal;
import java.util.Date;

public class salary_grant {
    private String salaryGrantId;

    private String salaryStandardId;

    private String secondKindId;

    private Short humanAmount;

    private BigDecimal salaryStandardSum;

    private BigDecimal salaryPaidSum;

    private String register;

    private Date registTime;

    private String checker;

    private Date checkTime;

    private Short checkStatus;

    public String getSalaryGrantId() {
        return salaryGrantId;
    }

    public void setSalaryGrantId(String salaryGrantId) {
        this.salaryGrantId = salaryGrantId;
    }

    public String getSalaryStandardId() {
        return salaryStandardId;
    }

    public void setSalaryStandardId(String salaryStandardId) {
        this.salaryStandardId = salaryStandardId;
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId;
    }

    public Short getHumanAmount() {
        return humanAmount;
    }

    public void setHumanAmount(Short humanAmount) {
        this.humanAmount = humanAmount;
    }

    public BigDecimal getSalaryStandardSum() {
        return salaryStandardSum;
    }

    public void setSalaryStandardSum(BigDecimal salaryStandardSum) {
        this.salaryStandardSum = salaryStandardSum;
    }

    public BigDecimal getSalaryPaidSum() {
        return salaryPaidSum;
    }

    public void setSalaryPaidSum(BigDecimal salaryPaidSum) {
        this.salaryPaidSum = salaryPaidSum;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }
}