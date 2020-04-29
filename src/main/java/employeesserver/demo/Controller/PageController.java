package employeesserver.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @Author: YanFan
 * @Date: 2019/12/19 15:35
 * @Version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping(value = "/vue-demo/test")
    @ResponseBody
    public HashMap getMess(HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "http://www.domain1.com");
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","nihao");
        hashMap.put("3","welcome");
        hashMap.put("4","欢迎来到中国");
        return hashMap;
    }
}
