package javase.chap04.Throw_16;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class Throw {
    public void regist(int num) throws MyException {
        if(num < 0)
        {
            throw new MyException("�˹��׳��쳣������Ϊ������",3);
        }
        System.out.println("�Ǽ�����:"+num);
    }
    public void manager()
    {
        try {
            regist(-100);
        } catch (MyException e) {
            System.out.println("�Ǽǳ���,���"+e.getId());
        }
        System.out.println("�����Ǽǲ�������");
    }
}
