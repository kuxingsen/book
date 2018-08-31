package javase.chap04.AuthorityTest.china.beijing;

import javase.chap04.AuthorityTest.china.hb.Family;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class SubFamily extends Family {
    public static void main(String[] args) {
        SubFamily subFamily = new SubFamily();
        subFamily.doorPlate="aaa";
        System.out.println(subFamily.doorPlate);
        //subFamily.getVehiecle();
        subFamily.getSecret();

    }
}
