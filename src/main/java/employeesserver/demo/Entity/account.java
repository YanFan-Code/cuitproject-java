package employeesserver.demo.Entity;

/**
 * @Author: YanFan
 * @Date: 2020/1/26 15:13
 * @Version: 1.0
 */
public class account {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "account{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
