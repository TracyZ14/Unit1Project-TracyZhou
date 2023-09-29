import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Asks user for the bill, tip percentage, and number of people
        Scanner s = new Scanner(System.in);
        System.out.print("Bill: $");
        String a = s.nextLine();
        double bill = Double.parseDouble(a);
        System.out.print("Tip % (whole number without %): ");
        String b = s.nextLine();
        double tipPercentage = Double.parseDouble(b);
        System.out.print("Number of people: ");
        String c = s.nextLine();
        double numberOfPeople = Double.parseDouble(c);
        // Calculates the total tip amount, total bill including tip, tip per person, and total per person (bill and tip together)
        double totalTipAmount = bill * (tipPercentage / 100);
        double totalBill = bill + totalTipAmount;
        double tipPerPerson = totalTipAmount / numberOfPeople;
        double totalPerPerson = totalBill / numberOfPeople;
        // Displays the results of the calculations above in monetary form
        System.out.println("Total tip amount: $" + (Math.ceil(totalTipAmount * 100) / 100));
        System.out.println("Total bill: $" + (Math.ceil(totalBill * 100) / 100));
        System.out.println("Tip per person: $" + (Math.ceil(tipPerPerson * 100) / 100));
        System.out.println("Total per person: $" + (Math.ceil(totalPerPerson * 100) / 100));
        s.close();
    }
}