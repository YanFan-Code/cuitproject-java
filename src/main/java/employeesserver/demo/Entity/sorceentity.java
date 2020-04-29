package employeesserver.demo.Entity;

import java.util.Arrays;

/**
 * @Author: YanFan
 * @Date: 2020/2/25 22:18
 * @Version: 1.0
 */
public class sorceentity {
    int[][] arr;
    float sorce;
    String assess;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public float getSorce() {
        return sorce;
    }

    public void setSorce(float sorce) {
        this.sorce = sorce;
    }

    public String getAssess() {
        return assess;
    }

    public void setAssess(String assess) {
        this.assess = assess;
    }

    @Override
    public String toString() {
        return "sorceentity{" +
                "arr=" + Arrays.toString(arr) +
                ", sorce=" + sorce +
                ", assess='" + assess + '\'' +
                '}';
    }
}
