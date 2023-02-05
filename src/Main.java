import java.util.Scanner;

public class Main {

    public static void show_menu(){
        System.out.println("\nChoose 1 for withdraw" +
                "\nChoose 2 for deposit" +
                "\nChoose 3 for check balance" +
                "\nChoose 4 for Exit\nSelecet to do......");
    }
   /* this funciton will use later
    public static void atm_procses(int selection,drawe_money){

        switch (selection){
            case 1 :
                System.out.println("Your deposite is : "+drae_money);
                System.out.print("How much do you draw :");
                int sel_money=input.nextInt();

                if (sel_money<=0  || sel_money >drae_money) {
                    System.out.println("wrong number");
                }
                else {
                    drae_money=drae_money-sel_money;
                    System.out.println("New Deposite is = "+drae_money);
                }
                break;
            case 2 :
                System.out.println("Your deposite is : "+drae_money);
                System.out.print("How much do you draw :");
                int add_money=input.nextInt();
                drae_money=drae_money+add_money;
                System.out.println("New Deposite is = "+drae_money);

        }
    }*/


    public static void main(String[] args) {
        int drae_money=1000,selecet;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to SHAMIL Bank ATM");

        while (true){
            show_menu();
            selecet=input.nextInt();


            switch (selecet){
                case 1 :
                    System.out.println("Your deposite is : "+drae_money);
                    System.out.print("How much do you draw :");
                    int sel_money=input.nextInt();
                    if (sel_money<=0  || sel_money >drae_money) {
                        System.out.println("wrong number");
                    }
                    else {
                        drae_money=drae_money-sel_money;
                        System.out.println("New Deposite is = "+drae_money);
                    }
                    break;
                case 2 :
                    System.out.println("Your deposite is : "+drae_money);
                    System.out.print("How much do you draw :");
                    int add_money=input.nextInt();
                    drae_money=drae_money+add_money;
                    System.out.println("New Deposite is = "+drae_money);
                    break;
                case 3 :
                    System.out.println("You Have :"+drae_money+"$");
                    break;
                case 4:
                    System.out.println("Are you sure !!! yes (y) or no (n) ");
                    String sel_exit=input.next();
                    if(sel_exit.equals("y")||sel_exit.equals("Y")){
                        System.exit(0);
                    }
                    if (sel_exit=="n" || sel_exit=="N"){
                        show_menu();
                    }
                default:
                    System.out.println("System ERROR 404");
            }
        }
    }
}