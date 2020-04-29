package employeesserver.demo.Service.ServiceImpl;

import employeesserver.demo.Dao.AskForDao;
import employeesserver.demo.Entity.AskFor;
import employeesserver.demo.Service.AskForService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/22 14:29
 * @Version: 1.0
 */
@Service
public class AskForServiceImpl implements AskForService {

    @Autowired
    AskForDao askForDao;

    @Override
    public List<AskFor> findAll() {
        return askForDao.findAll();
    }

    public int reciveArecord( AskFor askFor){
        return askForDao.reciveArecord(askFor);
    }

    @Override
    public List<AskFor> findAllByemployeeId(Integer employeeId) {
        return askForDao.findAllByemployeeId(employeeId);
    }
}
