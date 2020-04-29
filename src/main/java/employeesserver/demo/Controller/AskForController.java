package employeesserver.demo.Controller;

import employeesserver.demo.Entity.AskFor;
import employeesserver.demo.Service.AskForService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: YanFan
 * @Date: 2020/2/22 14:30
 * @Version: 1.0
 */
@RestController
public class AskForController {
    @Autowired
    AskForService askForServiceImpl;


    @GetMapping("/AskFors")
    public List<AskFor> findAll(){
        return askForServiceImpl.findAll();
    }

    @PutMapping("/AskFors/1")
    public int reciveArecord(@RequestBody AskFor askFor){
        return askForServiceImpl.reciveArecord(askFor);
    }

    @GetMapping("/AskFors/{employeeId}")
    public List<AskFor> findAllByemployeeId(@PathVariable Integer employeeId){
        return askForServiceImpl.findAllByemployeeId(employeeId);
    }
}