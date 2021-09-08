package Monster;

public abstract class Monster {
//    怪物名
    String name = "未知生物";
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

//    怪物 HP
    long HP = 10;
    public long getHP() { return HP; }
    public void setHP(long HP) { this.HP = HP; }

//    怪物 MP
    long MP = 10;
    public long getMP() { return MP; }
    public void setMP(long MP) { this.MP = MP; }

//    怪物攻击力
    long attack = 1;
    long getAttack() { return attack; }
    public void setAttack(long attack) { this.attack = attack; }

//    怪物防御力
    long defense = 0;
    public long getDefense() { return defense; }
    public void setDefense(long defense) { this.defense = defense; }

//    获取怪物信息
    public void getInfo() {
        System.out.println("一只具有\n" +
                this.HP + " HP \n" +
                this.MP + " MP \n" +
                "攻击力为 " + this.attack + " 的" + this.name
        );
    }

}
