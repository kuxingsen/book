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
        //向peoperties中增加属性
        props.setProperty("dept","肇庆学院");
        props.setProperty("username","asd");
        props.setProperty("password","123");
        //建立文件字节输出流，a.ini默认在项目文件夹中
        FileOutputStream fos = new FileOutputStream("a.ini");
        //将Properties中的key-value写入到a.ini文件中，第一行为#注释行
        props.store(fos,"注释行");
        System.out.println(props);
        fos.close();
        //新建一个Properties对象
        Properties prop2 = new Properties();
        //向Properties中增加属性
        prop2.setProperty("gender","male");
        prop2.setProperty("dept","Handan");
        //将a.ini文件中的key-value对追加到peops2中
        FileInputStream fis = new FileInputStream("a.ini");
        prop2.load(fis);
        System.out.println(prop2.get("dept"));
        FileOutputStream fos1 = new FileOutputStream("a.ini");
        System.out.println("\u6559\u52A1\u5904");
        prop2.store(fos1,"\u6559\u52A1\u5904");
        System.out.println(prop2);


    }
}
