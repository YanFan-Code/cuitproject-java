package employeesserver.demo.Dao;

import employeesserver.demo.Entity.empRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/19 15:51
 * @Version: 1.0
 */
@Repository
@Mapper
public interface AchievementDao {

    @Select("SELECT COUNT(*) AS count FROM achievement where employee_id = #{0} and PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format( start_day, '%Y%m' ) ) =#{1}")
    int getquarterlydata(Integer employeeId,Integer num);

    @Insert("Insert into achievement (employee_id,type,detail,start_day,end_day) values (#{emprecord.employeeId},#{emprecord.type},#{emprecord.detail},#{emprecord.startDay},#{emprecord.endDay})")
    int addAchievement(@Param("emprecord")empRecord empRecord);

    @Select("SELECT * FROM achievement where employee_id = #{0}")
    List<empRecord> findByemployeeId(Integer employeeId);

    @Select("SELECT * FROM achievement where employee_id = #{0} and start_day = #{1}")
    List<empRecord> findRecordByDate(Integer employeeId, Date date);
}
