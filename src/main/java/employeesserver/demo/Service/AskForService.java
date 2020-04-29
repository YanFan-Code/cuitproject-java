package employeesserver.demo.Service;

import employeesserver.demo.Entity.AskFor;

import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/22 14:28
 * @Version: 1.0
 */
public interface AskForService {

    List<AskFor> findAll();

    int reciveArecord( AskFor askFor);

    List<AskFor> findAllByemployeeId(Integer employeeId);
}
