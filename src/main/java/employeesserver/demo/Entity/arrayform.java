package employeesserver.demo.Entity;

import java.sql.Date;

/**
 * @Author: YanFan
 * @Date: 2020/2/19 14:21
 * @Version: 1.0
 */
public class arrayform {
    String time;
    int count;

    public String getDate() {
        return time;
    }

    public void setDate(String time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "arrayform{" +
                "time=" + time +
                ", count=" + count +
                '}';
    }
}
