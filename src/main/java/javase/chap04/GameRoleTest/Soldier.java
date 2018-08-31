package javase.chap04.GameRoleTest;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class Soldier extends Role {
    private String name;
    private int attack;

    public Soldier(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}
