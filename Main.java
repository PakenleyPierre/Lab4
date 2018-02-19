import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String x = new String();
        int y;
        String digits = "0123456789ABCDEF";
        x = x.toUpperCase();
        Scanner Scanner = new Scanner(System.in);


        System.out.print("Enter a hexadecimal number: ");
        x = Scanner.nextLine();

        if (x.startsWith("0x")) {
            x = x.replaceAll("0x", "");
            int decimal = Integer.parseInt(x, 16);

            System.out.println("Your number is " + decimal + " in decimal");
        } else {
            int decimal = Integer.parseInt(x, 16);
            System.out.println("Your number is " + decimal + " in decimal");
        }

    }
}