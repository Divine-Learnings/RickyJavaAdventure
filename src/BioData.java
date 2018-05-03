import java.util.Scanner;
public class BioData {


    int  Age;
    String Gender;
    String ECo;
    int Hf;
    int Hi;
    String PU;
    String BT;
    String FCo;
    String  FC;
    String CMU;
    String p;
    String fn;
    static String n = System.getProperty("line.separator");
    public static void main(String args[]){
        BioData();
    }
    public static void BioData(){
        BioData Raj = new BioData();
            Raj.fn = "Gnanasusairaj Jeusudason";
            Raj.Age = 48;
            Raj.Gender = "MALE";
            Raj.ECo = "black";
            Raj.Hf = 5;
            Raj.Hi = 11;
            Raj.PU = "iPhoneX";
            Raj.BT = "o+";
            Raj.FCo = "Black";
            Raj.FC = "Indigo";
            Raj.CMU = "Dell Pression,HP spectre";
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
                    System.out.println(Raj.Age + " years");
                    break;
            }
        }
    }

}
