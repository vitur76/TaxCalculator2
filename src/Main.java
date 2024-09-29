public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        double price = 15.99;
        double tax = 8.4;
        int quantity = 500;
        double total = 0;
        total = price * quantity * tax;
        String message = "I want to buy " + quantity + " shirt!";

        System.out.printf(message);
        System.out.printf("\nTotal cost with tax is: " + total);

    }
}
