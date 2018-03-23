package cn.spring.day01;

/**
 * Created by Administrator on 2018/3/21.
 */
public class MESGOD_Service{
    private String Info;

    public void work(){
        System.out.println("Work"+Info);

    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }
}
