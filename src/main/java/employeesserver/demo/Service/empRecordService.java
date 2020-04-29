package employeesserver.demo.Service;

import employeesserver.demo.Entity.empRecord;

import java.sql.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/10 13:29
 * @Version: 1.0
 */
public interface empRecordService {

    List<empRecord> findAllRecord(int employee_id);

    List<empRecord> findRecordByDate(int employee_id, Date date);

    int addoutwork(empRecord empRecord);

    int addattendence(empRecord empRecord);

    int addachievement(empRecord empRecord);
}
