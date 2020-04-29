package employeesserver.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: YanFan
 * @Date: 2020/2/22 14:25
 * @Version: 1.0
 */
public class AskFor {
    int id;
    String type;
    int employeeId;
    String AskManagerId;
    String AskedemployeeId;
    String detail;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("AskManagerId")
    public String getAskManagerId() {
        return AskManagerId;
    }

    @JsonProperty("AskManagerId")
    public void setAskManagerId(String askManagerId) {
        AskManagerId = askManagerId;
    }

    @JsonProperty("AskedemployeeId")
    public String getAskedemployeeId() {
        return AskedemployeeId;
    }

    @JsonProperty("AskedemployeeId")
    public void setAskedemployeeId(String askedemployeeId) {
        AskedemployeeId = askedemployeeId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AskFor{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", employeeId=" + employeeId +
                ", AskManagerId='" + AskManagerId + '\'' +
                ", AskedemployeeId='" + AskedemployeeId + '\'' +
                ", detail='" + detail + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
