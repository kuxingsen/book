package OS.Process_scheduling;

import java.text.DecimalFormat;

/**
 * Created by Kuexun on 2018/6/5.
 */
public class Process {
    private String id;
    private String name;
    private int workTime;
    private int waitTime;
    private double priority;

    public Process(String id, String name, int workTime) {
        this.id = id;
        this.name = name;
        this.workTime = workTime;
        this.waitTime = 0;
        changePriority();//刚开始优先级都一样
    }

    public double changePriority(){
        DecimalFormat df = new DecimalFormat("#.00");
        priority = Double.valueOf(df.format(((workTime+waitTime+0.0)/workTime)));//保留两位小数
        return priority;
    }
    //工作时工作时间减少，等待时间不变，优先级不变
    public void work()
    {
        System.out.print("I am working!");
        System.out.println("当前优先级指数："+priority+",剩余工作时间："+(workTime-1)+"****process-"+id+":"+name);
        this.workTime--;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }
}
