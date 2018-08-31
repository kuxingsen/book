package javase.chap04.GameRoleTest;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class Magicer extends Role {
    private String name;
    private int grade;

    public Magicer(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int getAttack() {
        return grade * 5;
    }
}
