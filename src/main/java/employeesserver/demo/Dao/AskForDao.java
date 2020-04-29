package employeesserver.demo.Dao;

import employeesserver.demo.Entity.AskFor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/22 14:27
 * @Version: 1.0
 */
@Repository
@Mapper
public interface AskForDao {

    @Select("select * from AskFor order by type")
    List<AskFor> findAll();

    @Insert("insert into askfor (type,AskManagerId,AskedemployeeId,detail,employee_id) values (#{askFor.type},#{askFor.AskManagerId},#{askFor.AskedemployeeId},#{askFor.detail},#{askFor.employeeId})")
    int reciveArecord(@Param("askFor") AskFor askFor);

    @Select("select * from AskFor where employee_id = #{0} order by type")
    List<AskFor> findAllByemployeeId(Integer employeeId);
}
