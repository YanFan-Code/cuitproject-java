package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/2/10 13:20
 * @Version: 1.0
 */
public class empRecord {
    int attendenceId;
    int employeeId;
    String type;
    String detail;
    int workId;
    String place;
    int cost;
    Date startDay;
    Date endDay;

    public int getAttendenceId() {
        return attendenceId;
    }

    public void setAttendenceId(int attendenceId) {
        this.attendenceId = attendenceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
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
        return "empRecord{" +
                "attendenceId=" + attendenceId +
                ", employeeId=" + employeeId +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", workId=" + workId +
                ", place='" + place + '\'' +
                ", cost=" + cost +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                '}';
    }
}
