package employeesserver.demo.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import employeesserver.demo.Entity.Result.AppResult;
import employeesserver.demo.Entity.Result.RetResponse;
import employeesserver.demo.Entity.Result.employeeResponse;
import employeesserver.demo.Entity.employees;
import employeesserver.demo.Entity.sorceentity;
import employeesserver.demo.Service.employeesService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.*;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 13:47
 * @Version: 1.0
 */
@RestController
public class employeeController {
    @Autowired
    employeesService employeesServiceImpl;


    //查询所有的员工信息
    @GetMapping("/employees")
    public List<employees> findAll(){
        return employeesServiceImpl.findAll();
    }

    //根据username查找员工信息
    @GetMapping("/employees/{username}")
    public AppResult<employees> FindByUserName(@PathVariable String username){
        employees employee = employeesServiceImpl.FindByUserName(username);
        if (employee == null)
            return employeeResponse.makeFAIL();
        return employeeResponse.findByUsername(employee);
    }

    //修改员工信息
    @PostMapping(value = "/employees/{username}")
    public AppResult<Integer> updateemployee(@PathVariable String username,@RequestBody employees employees){
        System.out.println(employees);
        int i = employeesServiceImpl.updateemployee(username,employees);
        return employeeResponse.sendSuccess(i);
    }

    //根据employeeId得到自己管理的所有员工
    @GetMapping("/staff/{employeeId}")
    public List<employees> FindAllStaff(@PathVariable Integer employeeId){
        return employeesServiceImpl.getStaffByemployeeId(employeeId);
    }

    //根据姓名进行模糊查找
    @GetMapping("/staff/like/{name}")
    public List<employees> FindStaffByname(@PathVariable String name){
        return employeesServiceImpl.getStaffByname(name);
    }

    //获取是同一个管理者的同事
    @GetMapping("/workmates/{employeeId}/{managerId}")
    public List<employees> FindWorkMates(@PathVariable Integer employeeId,@PathVariable Integer managerId){
        return employeesServiceImpl.getworkmates(employeeId,managerId);
    }

    //根据name进行模糊查找同事
    @GetMapping("/workmates/{employeeId}/{managerId}/{name}")
    public List<employees> FindWorkMatesByname(@PathVariable Integer employeeId,@PathVariable Integer managerId,@PathVariable String name){
        return employeesServiceImpl.getworkmatesByName(employeeId,managerId,name);
    }

    //获取本季度的三个指标数据
    @GetMapping("/employees/datatableformonth/{employeeId}")
    public sorceentity  findquarterlydataformonth(@PathVariable Integer employeeId){
        return employeesServiceImpl.findquerterlydata(employeeId);
    }

    //获取本年度的三个指标数据
    @GetMapping("/employees/datatableforyear/{employeeId}")
    public sorceentity findquarterlydataforyear(@PathVariable Integer employeeId){
        return employeesServiceImpl.findquerterlydataforyear(employeeId);
    }
}
