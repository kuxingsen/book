package javase.chap04.CastUpDown_10;


/**
 * Created by Kuexun on 2018/4/29.
 */
public class Animals {
    public void breathe()
    {
        System.out.println("Aniamls breathe....");
    }
    public final static void live(Animals an)
    {
        an.breathe();
    }
}
