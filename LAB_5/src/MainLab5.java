package LAB_5.src;

public class MainLab5 {
    public static void main(String[] args) {
        try {
            Sweet[] items = {
                    new ChocolateCandy("Roshen Truffle", 15.5, 75.0),
                    new Lollipop("Chupa Chups", 12.0),
                    new Caramel("Candy Nut", 10.0, 15.0)
            };

            Gift gift = new Gift(items);

            System.out.println("Total Gift Weight: " + gift.calculateTotalWeight() + "g");

            System.out.println("\nSorted by weight:");
            gift.sortByWeight();
            gift.printGift();

            double min = 10.0, max = 20.0;
            Sweet found = gift.findCandyByChocolateRange(min, max);
            System.out.println("\nCandy with chocolate between " + min + "% and " + max + "%:");
            System.out.println(found != null ? found : "Not found");

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
