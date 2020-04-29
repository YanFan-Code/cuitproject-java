package employeesserver.demo.Entity.Result;

import employeesserver.demo.Entity.employees;
import java.util.*;

/**
 * @Author: YanFan
 * @Date: 2020/2/5 15:44
 * @Version: 1.0
 */
public class employeeResponse {
    //请求成功返回信息
    public static <T> AppResult<List<employees>> findAll(List<employees> employeesList){
        return new AppResult<List<employees>>().setCode(ResultCode.SUCCESS).setData(employeesList);
    }

    //请求成功返回信息
    public static <T> AppResult<employees> findByUsername(employees employee){
        return new AppResult<employees>().setCode(ResultCode.SUCCESS).setData(employee);
    }

    //请求失败的返回信息
    public static <T> AppResult<employees> makeFAIL(){
        return new AppResult<employees>().setCode(ResultCode.FAIL).setMsg("FAILED");
    }

    //修改信息成功
    public static <T> AppResult<Integer> sendSuccess(Integer num){
        return new AppResult<Integer>().setCode(ResultCode.SUCCESS).setData(num);
    }
}
