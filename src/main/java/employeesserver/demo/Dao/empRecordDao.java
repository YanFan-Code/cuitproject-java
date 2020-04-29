package employeesserver.demo.Dao;

import employeesserver.demo.Entity.empRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;


/**
 * @Author: YanFan
 * @Date: 2020/2/10 13:22
 * @Version: 1.0
 */
@Repository
@Mapper
public interface empRecordDao {

    @Select("select * from emp_record where employee_id = #{0}")
    List<empRecord> findAllRecord(int employeeId);

    @Select("select * from emp_record where employee_id = #{0} and daytime = #{1}")
    List<empRecord> findRecordByDate(int employeeId, Date date);
}
