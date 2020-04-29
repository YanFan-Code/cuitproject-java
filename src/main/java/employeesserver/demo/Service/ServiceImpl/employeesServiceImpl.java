package employeesserver.demo.Service.ServiceImpl;

import employeesserver.demo.Dao.AchievementDao;
import employeesserver.demo.Dao.employeeDao;
import employeesserver.demo.Dao.outworkDao;
import employeesserver.demo.Entity.employees;
import employeesserver.demo.Entity.sorceentity;
import employeesserver.demo.Service.employeesService;
import employeesserver.demo.Tools.scoreAssess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 13:45
 * @Version: 1.0
 */
@Service
public class employeesServiceImpl implements employeesService {
    @Autowired
    employeeDao employeeDao;

    @Autowired
    outworkDao outworkDao;

    @Autowired
    AchievementDao achievementDao;

    @Autowired
    scoreAssess scoreAssess;

    @Override
    public List<employees> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public employees FindByUserName(String username) {
        return employeeDao.FindByUserName(username);
    }


    @Override
    public int updateemployee(String username, employees employees) {
        return employeeDao.updateemployee(username, employees);
    }

    @Override
    public List<employees> getStaffByemployeeId(Integer employeeId) {
        return employeeDao.getStaffByemployeeId(employeeId);
    }

    @Override
    public List<employees> getStaffByname(String name) {
        name = "%" + name + "%";
        return employeeDao.getStaffByname(name);
    }

    @Override
    public List<employees> getworkmates(Integer employeeId,Integer managerId){
        return  employeeDao.getworkmates(employeeId,managerId);
    }

    @Override
    public List<employees> getworkmatesByName(Integer employeeId, Integer managerId, String name) {
        return employeeDao.getworkmatesByName(employeeId,managerId,'%'+name+'%');
    }

    @Override
    public sorceentity findquerterlydata(Integer employeeId) {
        sorceentity sorceentity = new sorceentity();
        int arr[][] = new int[3][3];
        //获取当前日期
        Date date = new Date();
        //设置日期格式为MM
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM");
        //获取当前月
        int month = Integer.valueOf(dateFormat1.format(date));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        if (month % 3 == 0){
            arr[1][0]=employeeDao.getquarterlydata(employeeId,2);
            arr[1][1]=employeeDao.getquarterlydata(employeeId,1);
            arr[1][2]=employeeDao.getquarterlydata(employeeId,0);
            arr[0][0]=outworkDao.getquarterlydata(employeeId,2);
            arr[0][1]=outworkDao.getquarterlydata(employeeId,1);
            arr[0][2]=outworkDao.getquarterlydata(employeeId,0);
            arr[2][0]=achievementDao.getquarterlydata(employeeId,2);
            arr[2][1]=achievementDao.getquarterlydata(employeeId,1);
            arr[2][2]=achievementDao.getquarterlydata(employeeId,0);
        }else if(month % 3 == 2){
            arr[1][0]=employeeDao.getquarterlydata(employeeId,1);
            arr[1][1]=employeeDao.getquarterlydata(employeeId,0);
            arr[0][0]=outworkDao.getquarterlydata(employeeId,1);
            arr[0][1]=outworkDao.getquarterlydata(employeeId,0);
            arr[2][0]=achievementDao.getquarterlydata(employeeId,1);
            arr[2][1]=achievementDao.getquarterlydata(employeeId,0);
        }else{
            arr[1][0]=employeeDao.getquarterlydata(employeeId,0);
            arr[0][0]=outworkDao.getquarterlydata(employeeId,0);
            arr[2][0]=achievementDao.getquarterlydata(employeeId,0);
        }
        sorceentity.setArr(arr);
        sorceentity.setSorce(scoreAssess.giveSorce(arr));
        sorceentity.setAssess(new String(scoreAssess.comment(arr).append("满分为5分,综合得分为"+scoreAssess.giveSorce(arr)+"。")));
        return sorceentity;
    }

    @Override
    public sorceentity findquerterlydataforyear(Integer employeeId) {
        sorceentity sorceentity = new sorceentity();
        int arr[][] = new int[3][12];
        //获取当前日期
        Date date = new Date();
        //设置日期格式为MM
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM");
        //获取当前月
        int month = Integer.valueOf(dateFormat1.format(date));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        for (int i = month;i>0;i--){
            for(int j = 0;j<3;j++) {
                arr[1][j] = employeeDao.getquarterlydata(employeeId, month - j - 1);
                arr[0][j] = outworkDao.getquarterlydata(employeeId, month - j - 1);
                arr[2][j] = achievementDao.getquarterlydata(employeeId, month - j - 1);
            }
        }
        sorceentity.setArr(arr);
        sorceentity.setSorce(scoreAssess.giveSorce(arr));
        sorceentity.setAssess(new String(scoreAssess.comment(arr).append("满分为5分,综合得分为"+scoreAssess.giveSorce(arr)+"。")));
        return sorceentity;
    }
}
