import java.util.Scanner;
public class BioData {


    int  Age;
    String Gender;
    String ECo;
    int Hieghtfeet;
    int Hieghtin;
    String Phoneusing;
    String Bloodtype;
    String Favoritecolor;
    String Favoritecar;
    String Computer;
    String p;
    String Fullname;
    static String n = System.getProperty("line.separator");
    public static void main(String args[]){
        BioData();
    }
    public static void BioData(){
        BioData Raj = new BioData();
            Raj.Fullname = "Gnanasusairaj Jeusudason";
            Raj.Age = 48;
            Raj.Gender = "MALE";
            Raj.ECo = "black";
            Raj.Hieghtfeet = 5;
            Raj.Hieghtin = 11;
            Raj.Phoneusing = "iPhoneX";
            Raj.Bloodtype = "o+";
            Raj.Favoritecolor = "Black";
            Raj.Favoritecar = "Indigo";
            Raj.Computer = "Dell Pression,HP spectre";
            Raj.p = "father";
        BioData Jessie = new BioData();
        BioData Derrick = new BioData();
        BioData Elfrick = new BioData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("Raj");
        System.out.println("Jessie");
        System.out.println("Derrick");
        System.out.println("Elfrick" + n);
        System.out.println("Which person do you want to know about?");
        String pChoice = sc.nextLine();
        if(pChoice.equals("Raj")) {
            System.out.println("What do you want to know about Raj?");
            String aChoice = sc.nextLine();
            switch (aChoice){
                case "Age":
                    System.out.println("Raj is "+Raj.Age + " years");
                    break;
                case "Full name":
                    System.out.println("raj's full name is "+Raj.Fullname);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Eye Color":
                    System.out.println("Raj's "+Raj.ECo);
                    break;
                case"Blood type":
                    System.out.println("Raj's blood type is"+Raj.Bloodtype);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;
                case"Gender":
                    System.out.println("Raj is a"+Raj.Gender);
                    break;




            }
        }
    }

}
