import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
        double totalTipAmount = bill * (1 + ((tipPercentage / 100)));
        double totalBill = bill + totalTipAmount;
        double tipPerPerson = totalTipAmount / numberOfPeople;
        double totalPerPerson = totalBill / numberOfPeople;
        System.out.println("Total tip amount: $" + totalTipAmount);
        System.out.println("Total bill: $" + totalBill);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total per person: $" + totalPerPerson);
        s.close();
    }
}