package employeesserver.demo.Entity.Result;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 15:42
 * @Version: 1.0
 */
public class AppResult<T> {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public AppResult<T> setCode(ResultCode retCode) {
        this.code = retCode.index;
        return this;
    }

    public AppResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AppResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public AppResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
