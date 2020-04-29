package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/2/18 12:41
 * @Version: 1.0
 */
public class attendence {
    int attendenceId;
    int employeeId;
    Date daytime;
    String detail;
    String type;

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

    public Date getDaytime() {
        return daytime;
    }

    public void setDaytime(Date daytime) {
        this.daytime = daytime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "attendence{" +
                "attendenceId=" + attendenceId +
                ", employeeId=" + employeeId +
                ", daytime=" + daytime +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
