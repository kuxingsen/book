package javase.chap04.Throw_16;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class MyException extends Exception {
    private int idnumber;
    //����MyExceptionĬ�ϵĹ��췽��
    public MyException(String message,int id)
    {
        super(message);
        this.idnumber = id;
    }
    public int getId()
    {
        return idnumber;
    }

}
