package employeesserver.demo.Service;

import employeesserver.demo.Entity.employees;
import employeesserver.demo.Entity.sorceentity;

import java.sql.Date;
import java.util.*;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 13:43
 * @Version: 1.0
 */
public interface employeesService {
    List<employees> findAll();

    employees FindByUserName(String username);

    int updateemployee(String username, employees employees);

    List<employees> getStaffByemployeeId(Integer employeeId);

    List<employees> getStaffByname(String name);

    List<employees> getworkmates(Integer employeeId,Integer managerId);

    List<employees> getworkmatesByName(Integer employeeId,Integer managerId,String name);

    sorceentity findquerterlydata(Integer employeeId);

    sorceentity findquerterlydataforyear(Integer employeeId);
}
