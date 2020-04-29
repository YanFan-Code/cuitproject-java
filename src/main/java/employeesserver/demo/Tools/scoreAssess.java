package employeesserver.demo.Tools;

import org.springframework.stereotype.Component;

/**
 * @Author: YanFan
 * @Date: 2020/2/25 22:24
 * @Version: 1.0
 */
@Component
public class scoreAssess {
    
    public float giveSorce(int[][] arr){
        float finalscore = 50f;
        int outwork = 0;
        int attendence = 0;
        int achievement = 0;
        for (int i = 0; i < arr[0].length; i++) {
            outwork +=arr[0][i];
        }
        for (int i = 0; i < arr[1].length; i++) {
            attendence +=arr[1][i];
        }
        for (int i = 0; i < arr[2].length; i++) {
            achievement +=arr[2][i];
        }
        finalscore = (finalscore-attendence*4+outwork*3+achievement*6) / 20;
        return finalscore;
    }


    public StringBuffer comment(int[][] arr){
        StringBuffer sb = new StringBuffer();
        int outwork = 0;
        int attendence = 0;
        int achievement = 0;
        for (int i = 0; i < arr[0].length; i++) {
            outwork +=arr[0][i];
        }
        for (int i = 0; i < arr[1].length; i++) {
            attendence +=arr[1][i];
        }
        for (int i = 0; i < arr[2].length; i++) {
            achievement +=arr[2][i];
        }
        if (outwork < 2*arr[0].length){
            sb.append("出差方面不够出众，");
        }else if(outwork >= 2*arr[0].length && outwork < 5*arr[0].length){
            sb.append("出差方面表现一般，");
        }else{
            sb.append("出差方面表现优秀，");
        }
        if (attendence < 2*arr[0].length){
            sb.append("偶尔缺勤，");
        }else if(attendence >= 2*arr[0].length && attendence < 5*arr[0].length){
            sb.append("缺勤次数较多，");
        }else{
            sb.append("缺勤太过频繁，");
        }
        if (achievement < 2*arr[0].length){
            sb.append("完成任务方面不够突出，");
        }else if(achievement >= 2*arr[0].length && achievement < 5*arr[0].length){
            sb.append("完成任务方面比较一般，");
        }else{
            sb.append("完成任务方面表现优秀，");
        }
        return sb;
    }
}
