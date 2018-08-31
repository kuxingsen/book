package OS.Process_scheduling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuexun on 2018/6/5.
 */
public class ProcessPool {
    private List<Process> processes;
    private double maxPriority;
    private Process firstProcess;

    public ProcessPool() {
        processes = new ArrayList<>();
        maxPriority = 0f;
    }
    public boolean isEmpty()
    {
        return processes.isEmpty();
    }

    /**
     * 更改线程的优先级
     * @param id
     */
    public void changePriorty(String id)
    {
        for(Process p :processes)
        {
            if(!p.getId().equals(id))
            {
                p.setWaitTime(p.getWaitTime()+10);
                System.out.print("Process-"+p.getId()+"的优先级指数从"+p.getPriority()+"变成");
                p.changePriority();
                System.out.println(p.getPriority());
            }
            judgeMaxPriority(p);
        }
    }
    public void add(Process p)
    {
        processes.add(p);

        judgeMaxPriority(p);
    }
    public void remove(Process p)
    {
        processes.remove(p);
        maxPriority=0f;
        for(Process pro :processes)
        {
            judgeMaxPriority(pro);
        }
    }
    //判断最高优先级
    private void judgeMaxPriority(Process p)
    {
        double priority = p.getPriority();
        if(priority > maxPriority){
            maxPriority = priority;
            firstProcess = p;
        }
    }

    public List<Process> getProcesses() {
        return processes;
    }

    public Process getFirstProcess() {
        return firstProcess;
    }
}
