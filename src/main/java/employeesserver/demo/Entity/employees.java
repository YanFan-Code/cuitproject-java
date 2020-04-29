package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/1/21 13:16
 * @Version: 1.0
 */
public class employees {
    int EmployeeId;
    String username;
    String employeeName;
    String sex;
    int worktime;
    String background;
    String email;
    String telPhone;
    Date birthday;
    int managerId;
    int salary;
    String picture;


    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "employees{" +
                "EmployeeId=" + EmployeeId +
                ", username='" + username + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", sex='" + sex + '\'' +
                ", worktime=" + worktime +
                ", background='" + background + '\'' +
                ", email='" + email + '\'' +
                ", telPhone='" + telPhone + '\'' +
                ", birthday=" + birthday +
                ", managerId=" + managerId +
                ", salary=" + salary +
                ", picture='" + picture + '\'' +
                '}';
    }
}
