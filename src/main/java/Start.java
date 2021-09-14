import RandomEvents.BadEvents;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        // 处理输入的对象
        Scanner in = new Scanner(System.in);

        Player player = new Player(300, 1000, 1, 10);
        Knapsack knapsack = new Knapsack();
        BadEvents badEvents = new BadEvents();
        Story story = new Story();
        System.out.println("（输入[H]获取帮助）");
        while (true) {
            String input = in.nextLine();
            switch (input) {
                case "B" -> knapsack.getKnapsackList();
                case "H" -> getHelp();
                case "L" -> player.getStatus();
                case "G" -> knapsack.addItem("★   | 随处可见的石头");
                case "Q" -> knapsack.removeItem(0);
                case "Q1" -> {
                    System.out.println("发现了一只野生的派蒙\n派蒙咬了你一口\n你被吓死了.\n");
                    System.exit(0);
                }
                case "W" -> badEvents.getBadEvent();
            }
        }
    }

    public static void getHelp() {
        System.out.println("""
                操作方法：
                [W] - 前进一步。
                [B] - 查看背包。
                [L] - 查看自身状态。
                [G] - 捡起一块石头。
                [Q] - 丢弃背包中第一个物品。
                """
        );
    }
}
