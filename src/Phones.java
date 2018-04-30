import java.util.Scanner;
public class Phones {
    int ram;
    int storage;
    double price;
    public static void main(String args[]){
        phone();
    }
    public static void phone(){
        Phones iPhoneX = new Phones();
        Phones S8 = new Phones();
        Phones OP5T = new Phones();
        Phones iPhone8 = new Phones();
        Phones S8P = new Phones();
        Phones OP5TP = new Phones();
        //if you want, you can expand upon this...
        Scanner sc = new Scanner(System.in);
        System.out.println("Which phone do you want to know about?");
        String phoneChoice = sc.nextLine();
        if(phoneChoice.equals("iPhoneX")) {
            iPhoneX.ram = 2;
            iPhoneX.storage = 64;
            iPhoneX.price = 999.99;
            System.out.println(iPhoneX.ram + "GB, "+iPhoneX.storage+"GB, "+"$"+iPhoneX.price);
        }else if(phoneChoice.equals("S8")) {
            S8.ram = 6;
            S8.storage = 64;
            S8.price = 899.99;
            System.out.println(S8.ram + "GB, "+S8.storage+"GB, "+"$"+S8.price);
        }
    }
}
