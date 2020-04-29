package employeesserver.demo.Controller;

import employeesserver.demo.Entity.empRecord;
import employeesserver.demo.Service.empRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/10 13:35
 * @Version: 1.0
 */
@RestController
public class empRecordController {
    @Autowired
    empRecordService empRecordServiceImpl;

    @GetMapping("/records/{employee_id}")
    public List<empRecord> findAllRecord(@PathVariable Integer employee_id){
        return empRecordServiceImpl.findAllRecord(employee_id);
    }

    @GetMapping("/records/{employee_id}/{date}")
    public List<empRecord> findRecordByDate(@PathVariable Integer employee_id, @PathVariable Date date){
        return empRecordServiceImpl.findRecordByDate(employee_id,date);
    }

    @PutMapping("/records/outwork")
    public int addOutwork(@RequestBody empRecord empRecord){
        return empRecordServiceImpl.addoutwork(empRecord);
    }

    @PutMapping("/records/attendence")
    public int addAttendence(@RequestBody empRecord empRecord){
        return empRecordServiceImpl.addattendence(empRecord);
    }

    @PutMapping("/records/achievement")
    public int addAchievement(@RequestBody empRecord empRecord){
        return empRecordServiceImpl.addachievement(empRecord);
    }
}
