package employeesserver.demo.Service.ServiceImpl;


import employeesserver.demo.Dao.AchievementDao;
import employeesserver.demo.Dao.attendenceDao;
import employeesserver.demo.Dao.empRecordDao;
import employeesserver.demo.Dao.outworkDao;
import employeesserver.demo.Entity.empRecord;
import employeesserver.demo.Service.empRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/10 13:30
 * @Version: 1.0
 */
@Service
public class empRecordServiceImpl implements empRecordService {

    @Autowired
    attendenceDao attendenceDao;

    @Autowired
    outworkDao outworkDao;

    @Autowired
    AchievementDao achievementDao;

    @Override
    public List<empRecord> findAllRecord(int employee_id) {
        List<empRecord> list = new ArrayList<>(20);
        list.addAll(attendenceDao.findByEmployeeId(employee_id));
        list.addAll(outworkDao.findByEmployeeId(employee_id));
        list.addAll(achievementDao.findByemployeeId(employee_id));
        return list;
    }

    @Override
    public List<empRecord> findRecordByDate(int employee_id, Date date) {
        List<empRecord> list = new ArrayList<>(20);
        list.addAll(attendenceDao.findRecordByDate(employee_id,date));
        list.addAll(outworkDao.findRecordByDate(employee_id,date));
        list.addAll(achievementDao.findRecordByDate(employee_id,date));
        return list;
    }

    @Override
    public int addoutwork(empRecord empRecord) {
        return outworkDao.addoutwork(empRecord);
    }

    @Override
    public int addattendence(empRecord empRecord) {
        return attendenceDao.addAttendence(empRecord);
    }

    @Override
    public int addachievement(empRecord empRecord) {
        return achievementDao.addAchievement(empRecord);
    }
}
