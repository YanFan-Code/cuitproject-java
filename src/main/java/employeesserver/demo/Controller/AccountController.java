package employeesserver.demo.Controller;

import employeesserver.demo.Entity.Result.AppResult;
import employeesserver.demo.Entity.Result.RetResponse;
import employeesserver.demo.Service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 14:43
 * @Version: 1.0
 */
@RestController
public class AccountController {

    @Autowired
    accountService accountServiceImpl;

//    账号登录验证
    @PostMapping("/account")
    public AppResult<String> accountEmp(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        String resp = accountServiceImpl.accountEmp(username,password);
        if (resp != null){
            return RetResponse.makeOKmsg(username);
        }
        return RetResponse.makeFAIL();
    }
}
