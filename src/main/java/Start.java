import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player player = new Player(300, 1000, 1, 10);
        System.out.println("你醒了。\n（输入[H]获取帮助）");
        while (true) {
            String input = in.nextLine();
            switch (input) {
                case "H":
                    getHelp();
                    break;
                case "L":
                    player.getStatus();
                    break;
            }
        }
    }

    public static void getHelp() {
        System.out.println("""
                操作方法：
                [L] - 查看自身状态。
                """
        );
    }
}
