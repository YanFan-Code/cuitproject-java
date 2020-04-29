package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/2/19 15:49
 * @Version: 1.0
 */
public class achievement {
    int achievementId;
    int employeeId;
    String type;
    String detail;
    Date start_day;
    Date end_day;

    public int getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(int achievementId) {
        this.achievementId = achievementId;
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

    public Date getStart_day() {
        return start_day;
    }

    public void setStart_day(Date start_day) {
        this.start_day = start_day;
    }

    public Date getEnd_day() {
        return end_day;
    }

    public void setEnd_day(Date end_day) {
        this.end_day = end_day;
    }

    @Override
    public String toString() {
        return "achievement{" +
                "achievementId=" + achievementId +
                ", employeeId=" + employeeId +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", start_day=" + start_day +
                ", end_day=" + end_day +
                '}';
    }
}
