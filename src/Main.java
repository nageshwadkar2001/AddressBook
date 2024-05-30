import java.util.Scanner;
public class Main {
    public static boolean exit =true;

    public static void options(){
        System.out.println("Select the option\n 1.Create new Contact \n 2.Edit Existing contact \n 3.Display \n 4.deleteInfo \n 5.Exit" );

        Scanner sc=new Scanner(System.in);
        Contact obj=new Contact();
        int option=sc.nextInt();

        switch(option){
            case 1:
                obj.addContact();
                break;
            case 2:
                obj.updateContact();
                break;
            case 3:
                System.out.println(obj.getInfo());
                break;
            case 4:
                obj.deleteInfo();
                break;
            case 5:
                exit=false;
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    public static void main(String[] args) {
        System.out.println("-----Welcome to the AddressBook-----");
        while(exit)
        {
            options();
        }
    }
}
