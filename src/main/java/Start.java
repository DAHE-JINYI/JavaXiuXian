import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player player = new Player(300, 1000, 1, 10);
        Knapsack knapsack = new Knapsack();
        System.out.println("你醒了。\n（输入[H]获取帮助）");
        while (true) {
            String input = in.nextLine();
            switch (input) {
                case "B":
                    knapsack.getKnapsackList();
                    break;
                case "H":
                    getHelp();
                    break;
                case "L":
                    player.getStatus();
                    break;
                case "G":
                    knapsack.addItem("★   | 随处可见的石头");
                    break;
                case "Q":
                    knapsack.removeItem(0);
                    break;
                case "Q1":
                    System.out.println("发现了一只野生的派蒙\n" + "派蒙咬了你一口\n" + "你被吓死了.\n");
                    break;
            }
        }
    }

    public static void getHelp() {
        System.out.println("""
                操作方法：
                [B] - 查看背包。
                [L] - 查看自身状态。
                [G] - 捡起一块石头。
                [Q] - 丢弃背包中第一个物品。
                """
        );
    }
}
