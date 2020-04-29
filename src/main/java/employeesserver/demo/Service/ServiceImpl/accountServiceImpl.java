package employeesserver.demo.Service.ServiceImpl;

import employeesserver.demo.Dao.accountDao;
import employeesserver.demo.Service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 15:22
 * @Version: 1.0
 */
@Service
public class accountServiceImpl implements accountService {

    @Autowired
    accountDao accountDao;


    @Override
    public String accountEmp(String username, String password) {
        return accountDao.accountEmp(username,password);
    }
}
