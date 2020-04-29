package employeesserver.demo.Dao;

import employeesserver.demo.Entity.arrayform;
import employeesserver.demo.Entity.employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.*;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 13:38
 * @Version: 1.0
 */
@Mapper
@Repository
public interface employeeDao {
    @Select("select * from employees")
    List<employees> findAll();

    @Select("select * from employees where username = #{0}")
    employees FindByUserName(String username);

    @Update("update employees set employee_name = #{employees.employeeName},email = #{employees.email}," +
            "tel_phone = #{employees.telPhone},birthday = #{employees.birthday}  where username = #{username}")
    int updateemployee(@Param("username") String username,@Param("employees") employees employees);


    @Select("select * from employees where manager_id = #{0}")
    List<employees> getStaffByemployeeId(Integer employeeId);

    @Select("select * from employees where employee_name like #{0}")
    List<employees> getStaffByname(String name);

    @Select("select * from employees where employee_id != #{0} and manager_id = #{1}")
    List<employees> getworkmates(Integer employeeId,Integer managerId);

    @Select("select * from employees where employee_id != #{0} and manager_id = #{1} and employee_name like #{2}")
    List<employees> getworkmatesByName(Integer employeeId,Integer managerId,String name);

    @Select("SELECT COUNT(*) AS count FROM attendence where employee_id = #{0} and PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( start_day, '%Y%m' ) ) =#{1}")
    int getquarterlydata(Integer employeeId,Integer num);
}
