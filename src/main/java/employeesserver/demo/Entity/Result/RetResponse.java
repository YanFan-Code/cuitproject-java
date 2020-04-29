package employeesserver.demo.Entity.Result;

/**
 * @Author: YanFan
 * @Date: 2020/1/28 14:17
 * @Version: 1.0
 *
 * 请求登录的信息包装
 */
public class RetResponse {
    private final static String SUCCESS = "success";
    //请求登录成功返回信息
    public static <T> AppResult<String> makeOKmsg(String username){
        return new AppResult<String>().setCode(ResultCode.SUCCESS).setMsg(username);
    }
    //请求登录失败的返回信息
    public static <T> AppResult<String> makeFAIL(){
        return new AppResult<String>().setCode(ResultCode.FAIL).setMsg("FAILED");
    }
}
