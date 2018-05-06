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
            Jessie.Fullname = "Jessie Rani vedianikam thanghai";
            Jessie.Age = 48;
            Jessie.Gender = "FEMALE";
            Jessie.ECo = "black";
            Jessie.Hieghtfeet = 4;
            Jessie.Hieghtin = 11;
            Jessie.Phoneusing = "iPhoneX";
            Jessie.Bloodtype = "b+";
            Jessie.Favoritecolor = "Maroon";
            Jessie.Favoritecar = "N/A";
            Jessie.Computer = "Toshiba";
            Jessie.p = "Mother";
            BioData Derrick = new BioData();
                Derrick.Fullname = "Infant Derrick Gnanasusairaj";
                Derrick.Age = 16;
                Derrick.Gender = "MALE";
                Derrick.ECo = "black";
                Derrick.Hieghtfeet = 5;
                Derrick.Hieghtin = 8;
                Derrick.Phoneusing = "iPhoneX";
                Derrick.Bloodtype = "b+";
                Derrick.Favoritecolor = "Black";
                Derrick.Favoritecar = "Tesla Roadster";
                Derrick.Computer = "MSI GE 73 VR RAIDER-003";
                Derrick.p = "Big brother";
            BioData Elfrick = new BioData();
            Elfrick.Fullname = "Infant Elfrick Gnanasusairaj";
            Elfrick.Age = 11;
            Elfrick.Gender = "MALE";
            Elfrick.ECo = "black";
            Elfrick.Hieghtfeet = 4;
            Elfrick.Hieghtin = 7;
            Elfrick.Phoneusing = "iPhone 6";
            Elfrick.Bloodtype = "b+";
            Elfrick.Favoritecolor = "Black";
            Elfrick.Favoritecar = "Lamborghini Aventador";
            Elfrick.Computer = "NONE";
            Elfrick.p = "lil'brother";
            Scanner sc = new Scanner(System.in);
            System.out.println("Options:");
            System.out.println("Raj");
            System.out.println("Jessie");
            System.out.println("Derrick");
            System.out.println("Elfrick" + n);
            int z = 0;
            while(z == 0) {
                System.out.println("Which person do you want to know about?");
                String pChoice = sc.nextLine();
                if (pChoice.equals("Elfrick")) {
                    int x = 0;
                    while (x == 0) {

                        System.out.println("What do you want to know about Elfrick? Or you can type 'menu' for menu or 'exit' to exit");
                        String aChoice = sc.nextLine();
                        switch (aChoice) {
                            case "Age":
                                System.out.println("Elfrick is " + Elfrick.Age + " years");
                                break;
                            case "Full name":
                                System.out.println("Elfrick's full name is " + Elfrick.Fullname);
                                break;
                            case "Gender":
                                System.out.println(" Elfrick is a " + Elfrick.Gender);
                                break;
                            case "Eye Color":
                                System.out.println("Elfrick's " + Elfrick.ECo);
                                break;
                            case "Blood type":
                                System.out.println("Elfrick's blood type is " + Elfrick.Bloodtype);
                                break;
                            case "Height":
                                System.out.println("Elfrick is " + Elfrick.Hieghtfeet + " feet ," + Elfrick.Hieghtin + " inches");
                                break;
                            case "Phone":
                                System.out.println("Elfrick has a " + Elfrick.Phoneusing);
                                break;
                            case "Favorite color":
                                System.out.println("Elfrick's favorite color is " + Elfrick.Favoritecolor);
                                break;
                            case "Favorite car":
                                System.out.println("Elfrick's favorite car is " + Elfrick.Favoritecar);
                                break;
                            case "Computer":
                                System.out.println("Elfrick's computers are " + Elfrick.Computer);
                                break;
                            case "Place in family":
                                System.out.println(Elfrick.p);
                                break;
                            case "exit":
                                System.out.println("Goodbye!");
                                z = 1;
                            case "menu":
                                if(z == 0) {
                                    System.out.println("main-menu" + n + n + n + n + n);
                                }
                                x = 1;

                                break;

                            default:
                                System.out.println("HOW THE HELL DID YOU BREAK THIS?");
                        }
                    }
                } else if (pChoice.equals("Jessie")) {
                    int x = 0;
                    while (x == 0) {

                        System.out.println("What do you want to know about Jessie? Or you can type 'menu' for menu or 'exit' to exit");
                        String aChoice = sc.nextLine();
                        switch (aChoice) {
                            case "Age":
                                System.out.println("Jessie is " + Jessie.Age + " years");
                                break;
                            case "Full name":
                                System.out.println("Jessie's full name is " + Jessie.Fullname);
                                break;
                            case "Gender":
                                System.out.println(" Jessie is a " + Jessie.Gender);
                                break;
                            case "Eye Color":
                                System.out.println("Jessie's " + Jessie.ECo);
                                break;
                            case "Blood type":
                                System.out.println("Jessie's blood type is " + Jessie.Bloodtype);
                                break;
                            case "Height":
                                System.out.println("Jessie is " + Jessie.Hieghtfeet + " feet ," + Jessie.Hieghtin + " inches");
                                break;
                            case "Phone":
                                System.out.println("Jessie has a " + Jessie.Phoneusing);
                                break;
                            case "Favorite color":
                                System.out.println("Jessie's favorite color is " + Jessie.Favoritecolor);
                                break;
                            case "Favorite car":
                                System.out.println("Jessie's favorite car is " + Jessie.Favoritecar);
                                break;
                            case "Computer":
                                System.out.println("Jessie's computers are " + Jessie.Computer);
                                break;
                            case "Place in family":
                                System.out.println(Jessie.p);
                                break;
                            case "exit":
                                System.out.println("Goodbye!");
                                z = 1;
                            case "menu":
                                if(z == 0) {
                                    System.out.println("main-menu" + n + n + n + n + n);
                                }
                                x = 1;
                                break;

                            default:
                                System.out.println("HOW THE HELL DID YOU BREAK THIS?");
                        }
                    }
                } else if (pChoice.equals("Derrick")) {

                    int x = 0;
                    while (x == 0) {

                        System.out.println("What do you want to know about Derrick? Or you can type 'menu' for menu or 'exit' to exit");
                        String aChoice = sc.nextLine();
                        switch (aChoice) {
                            case "Age":
                                System.out.println("Derrick is " + Derrick.Age + " years");
                                break;
                            case "Full name":
                                System.out.println("Derrick's full name is " + Derrick.Fullname);
                                break;
                            case "Gender":
                                System.out.println(" Derrick is a " + Derrick.Gender);
                                break;
                            case "Eye Color":
                                System.out.println("Derrick's " + Derrick.ECo);
                                break;
                            case "Blood type":
                                System.out.println("Derrick's blood type is " + Derrick.Bloodtype);
                                break;
                            case "Height":
                                System.out.println("Derrick is " + Derrick.Hieghtfeet + " feet ," + Derrick.Hieghtin + " inches");
                                break;
                            case "Phone":
                                System.out.println("Derrick has a " + Derrick.Phoneusing);
                                break;
                            case "Favorite color":
                                System.out.println("Derrick's favorite color is " + Derrick.Favoritecolor);
                                break;
                            case "Favorite car":
                                System.out.println("Derrick's favorite car is " + Derrick.Favoritecar);
                                break;
                            case "Computer":
                                System.out.println("Derrick's computers are " + Derrick.Computer);
                                break;
                            case "Place in family":
                                System.out.println(Derrick.p);
                                break;
                            case "exit":
                                System.out.println("Goodbye!");
                                z = 1;
                            case "menu":
                                if(z == 0) {
                                    System.out.println("main-menu" + n + n + n + n + n);
                                }
                                x = 1;

                                break;

                            default:
                                System.out.println("HOW THE HELL DID YOU BREAK THIS?");
                        }
                    }

                } else if (pChoice.equals("Raj")) {


                    int x = 0;
                    while (x == 0) {

                        System.out.println("What do you want to know about Raj? Or you can type 'menu' for menu or 'exit' to exit");
                        String aChoice = sc.nextLine();
                        switch (aChoice) {
                            case "Age":
                                System.out.println("Raj is " + Raj.Age + " years");
                                break;
                            case "Full name":
                                System.out.println("raj's full name is " + Raj.Fullname);
                                break;
                            case "Gender":
                                System.out.println("Raj is a " + Raj.Gender);
                                break;
                            case "Eye Color":
                                System.out.println("Raj's " + Raj.ECo);
                                break;
                            case "Blood type":
                                System.out.println("Raj's blood type is " + Raj.Bloodtype);
                                break;
                            case "Height":
                                System.out.println("Raj is " + Raj.Hieghtfeet + " feet ," + Raj.Hieghtin + " inches");
                                break;
                            case "Phone":
                                System.out.println("Raj has a " + Raj.Phoneusing);
                                break;
                            case "Favorite color":
                                System.out.println("Raj's favorite color is " + Raj.Favoritecolor);
                                break;
                            case "Favorite car":
                                System.out.println("Raj's favorite car is " + Raj.Favoritecar);
                                break;
                            case "Computer":
                                System.out.println("Raj's computers are " + Raj.Computer);
                                break;
                            case "Place in family":
                                System.out.println(Raj.p);
                                break;
                            case "exit":
                                System.out.println("Goodbye!");
                                z = 1;
                            case "menu":
                                if(z == 0) {
                                    System.out.println("main-menu" + n + n + n + n + n);
                                }
                                x = 1;

                                break;

                            default:
                                System.out.println("HOW THE HELL DID YOU BREAK THIS?");

                        }
                    }
                }
            }


    }
}
