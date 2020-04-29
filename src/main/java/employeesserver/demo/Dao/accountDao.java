package employeesserver.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 15:16
 * @Version: 1.0
 */
@Repository
@Mapper
public interface accountDao {
    @Select("select username from account where username = #{0} and password = #{1}")
    String accountEmp(String username, String password);
}
