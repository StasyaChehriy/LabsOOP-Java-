package LAB_6.src;

import LAB_5.src.ChocolateCandy;
import LAB_5.src.Lollipop;

public class MainLab6 {
    public static void main(String[] args) {
        // Demonstrate different constructors
        SweetSet<ChocolateCandy> candySet = new SweetSet<>();
        candySet.add(new ChocolateCandy("Truffle", 15.0, 70.0));
        candySet.add(new ChocolateCandy("Truffle", 15.0, 70.0)); // Duplicate, won't be added

        System.out.println("Set size (should be 1): " + candySet.size());

        for (ChocolateCandy candy : candySet) {
            System.out.println("Item in set: " + candy.getName());
        }
    }
}
