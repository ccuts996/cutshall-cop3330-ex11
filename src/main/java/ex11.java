import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String euro;
        System.out.print(" How many euros are you exchanging? ");

        euro = input.next();

        Integer a = Integer.parseInt(euro);

        String exchangerate;
        System.out.print(" What is the exchange rate? ");

        exchangerate = input.next();

        Double b = Double.parseDouble(exchangerate);

        double dollars = Math.round(a * b*100d)/100d;

        System.out.print(a + " Euros at an exchange rate of " + b + " is currently " + dollars + " dollars.");
    }
}