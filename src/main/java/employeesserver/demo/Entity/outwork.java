package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/2/18 12:44
 * @Version: 1.0
 */
public class outwork {
    int workId;
    int employeeId;
    String place;
    int cost;
    String type;
    String detail;
    Date startDay;
    Date endDay;

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return "outwork{" +
                "workId=" + workId +
                ", employeeId=" + employeeId +
                ", place='" + place + '\'' +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                '}';
    }
}
