import java.lang.reflect.Array;

public class Knapsack {
    private String[] knapsack = new String[20];

    Knapsack() {
//        knapsack[0] = "★★★★  匣里龙吟";
    }

    public static void main(String[] args) {}

    public void getKnapsackList() {
        System.out.println("当前背包内容：");
        for (int i = 0; i < knapsack.length; i++) {
            if ( knapsack[i] != null ) {
                System.out.println(knapsack[i]);
            }
        }
    }

    public void addItem(String item) {
        for (int i = 0; i < knapsack.length; i++) {
            if ( knapsack[i] == null ) {
                knapsack[i] = item;
                System.out.println("你获得了：" + item);
                break;
            }
        }
    }
}
