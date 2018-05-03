import java.util.Scanner;
public class lesson2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x == 0) {
            System.out.println("Give me a day of the week or say 'Goodbye' to terminate");
            String day = sc.nextLine();
            switch (day) {
                case "Monday":
                    System.out.println("14.29%");
                    break;
                case "Tuesday":
                    System.out.println("28.57%");
                    break;
                case "Wednesday":
                    System.out.println("42.86%");
                    break;
                case "Thursday":
                    System.out.println("57.14%");
                    break;
                case "Friday":
                    System.out.println("71.43%");
                    break;
                case "Saturday":
                    System.out.println("85.71%");
                    break;
                case "Sunday":
                    System.out.println(100.0 + "%");
                    break;
                case "Goodbye":
                    System.out.println("Goodbye to you too!");
                    x = 1;
                    break;
                default:
                    System.out.println("HOW THE HELL DID YOU BREAK THIS?");
                    x = 1;
            }
        }
    }
}
