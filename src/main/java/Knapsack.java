import java.lang.reflect.Array;

public class Knapsack {

    /**
     * 一个拥有 20 格的背包
     */
    private String[] knapsack = new String[20];

    Knapsack() {
//        knapsack[0] = "★★★★  匣里龙吟";
    }

    public static void main(String[] args) {}

    /**
     * 列出背包内容
     */
    public void getKnapsackList() {
        System.out.println("当前背包内容：");
        for (int i = 0; i < knapsack.length; i++) {
            if ( knapsack[i] != null ) {
                System.out.println(knapsack[i]);
            }
        }
    }

    /**
     * 将物品装入背包
     * @param item 要装入的物品
     */
    public void addItem(String item) {
        for (int i = 0; i < knapsack.length; i++) {
            if ( knapsack[i] == null ) {
                knapsack[i] = item;
                System.out.println("你获得了：" + item);
                break;
            }
        }
    }

    /**
     * 丢弃背包中的物品
     * @param item 传入要丢弃物品的格子编号
     */
    public void removeItem(int item) {
        System.out.println("你丢弃了" + knapsack[item]);
        knapsack[item] = null;
    }
}
