package javase.chap05.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        //��peoperties����������
        props.setProperty("dept","����ѧԺ");
        props.setProperty("username","asd");
        props.setProperty("password","123");
        //�����ļ��ֽ��������a.iniĬ������Ŀ�ļ�����
        FileOutputStream fos = new FileOutputStream("a.ini");
        //��Properties�е�key-valueд�뵽a.ini�ļ��У���һ��Ϊ#ע����
        props.store(fos,"ע����");
        System.out.println(props);
        fos.close();
        //�½�һ��Properties����
        Properties prop2 = new Properties();
        //��Properties����������
        prop2.setProperty("gender","male");
        prop2.setProperty("dept","Handan");
        //��a.ini�ļ��е�key-value��׷�ӵ�peops2��
        FileInputStream fis = new FileInputStream("a.ini");
        prop2.load(fis);
        System.out.println(prop2.get("dept"));
        FileOutputStream fos1 = new FileOutputStream("a.ini");
        System.out.println("\u6559\u52A1\u5904");
        prop2.store(fos1,"\u6559\u52A1\u5904");
        System.out.println(prop2);


    }
}
