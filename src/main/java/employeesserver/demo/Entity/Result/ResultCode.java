package employeesserver.demo.Entity.Result;

/**
 * @Author: YanFan
 * @Date: 2020/1/28 14:14
 * @Version: 1.0
 */
public enum ResultCode {
    SUCCESS(200),
    FAIL(400);
    int index;
    ResultCode(int index){
        this.index = index;
    }

}
