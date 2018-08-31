package javase.chap04.GameRoleTest;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class Team {
    private Magicer magicer;
    private Soldier[] soldiers;
    private int num;
    public boolean addMember(Soldier s)
    {
        if(num >= 6 )
        {
            return false;
        }
        soldiers[num++] = s;
        return true;
    }
    public int attackSum()
    {
        int sum = magicer.getAttack();
        for (Soldier s :
                soldiers) {
            sum += s.getAttack();
        }
        return sum;
    }

    public Team(Magicer magicer) {
        this.magicer = magicer;
        num = 0;
        this.soldiers = new Soldier[6];
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public Magicer getMagicer() {
        return magicer;
    }

    public void setMagicer(Magicer magicer) {
        this.magicer = magicer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
