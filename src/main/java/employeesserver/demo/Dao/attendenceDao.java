package employeesserver.demo.Dao;

import employeesserver.demo.Entity.attendence;
import employeesserver.demo.Entity.empRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/18 12:50
 * @Version: 1.0
 */
@Repository
@Mapper
public interface attendenceDao {
    @Select("select * from attendence where employee_id =  #{0}")
    List<empRecord> findByEmployeeId(Integer employeeId);

    @Select("select * from attendence where employee_id = #{0} and start_day = #{1}")
    List<empRecord> findRecordByDate(int employeeId, Date date);

    @Insert("Insert into attendence (employee_id,start_day,end_day,detail,type,place)" +
            " values (#{emprecord.employeeId},#{emprecord.startDay},#{emprecord.endDay},#{emprecord.detail},#{emprecord.type},#{emprecord.place})")
    int addAttendence(@Param("emprecord")empRecord empRecord);
}
