package employeesserver.demo.Dao;

import employeesserver.demo.Entity.empRecord;
import employeesserver.demo.Entity.outwork;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/18 12:52
 * @Version: 1.0
 */
@Repository
@Mapper
public interface outworkDao {

    @Select("select * from outwork where employee_id = #{0}")
    List<empRecord> findByEmployeeId(Integer employeeId);

    @Select("select * from outwork where employee_id = #{0} and start_day = #{1}")
    List<empRecord> findRecordByDate(int employeeId, Date date);

    @Select("SELECT COUNT(*) AS count FROM outwork where employee_id = #{0} and PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( start_day, '%Y%m' ) ) =#{1}")
    int getquarterlydata(Integer employeeId,Integer num);

    @Insert("Insert into outwork (employee_id,place,cost,type,detail,start_day,end_day)" +
            " values (#{emprecord.employeeId},#{emprecord.place},#{emprecord.cost},#{emprecord.type},#{emprecord.detail},#{emprecord.startDay},#{emprecord.endDay})")
    int addoutwork(@Param("emprecord")empRecord empRecord);
}
