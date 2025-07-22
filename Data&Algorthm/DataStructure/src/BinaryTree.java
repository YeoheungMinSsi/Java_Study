import java.util.*;
public class BinaryTree {
    public static void main(String[] args) {
        Tree tm = new Tree();
        tm.add(10, "cho");
        tm.add(20, "kim");
        tm.add(30, "min");
        tm.add(40, "yeong");

        System.out.println("Data Search and Get...");

        Object temp = tm.get(20);

        System.out.println(temp);
        System.out.println("Data Search and Get End...");
        Object temp2 = tm.get(40);
        System.out.println(temp2);
    }
}
