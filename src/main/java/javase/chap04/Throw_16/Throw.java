package javase.chap04.Throw_16;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class Throw {
    public void regist(int num) throws MyException {
        if(num < 0)
        {
            throw new MyException("人工抛出异常：人数为负数！",3);
        }
        System.out.println("登记人数:"+num);
    }
    public void manager()
    {
        try {
            regist(-100);
        } catch (MyException e) {
            System.out.println("登记出错,类别："+e.getId());
        }
        System.out.println("本机登记操作结束");
    }
}
