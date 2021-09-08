public class Player {
    private long HP = 10;
    private long MP = 10;
    private long attack = 3;
    private long defense = 0;

    public Player(long HP, long MP, long attack, long defense) {
        this.HP = HP;
        this.MP = MP;
        this.attack = attack;
        this.defense = defense;
    }

    public void main() {}

    public void getStatus() {
        System.out.println("当前状态：\n" +
                "HP：" + HP + "\n" +
                "MP：" + MP
        );
    }
}
