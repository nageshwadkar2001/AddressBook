import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phone;
    String email;

    public AddressBook(){}
    public  AddressBook(String firstName,String lastName,String address,String city,String state,String zip,String phone,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
        this.email=email;
    }

    public void addDetails(){
        Scanner sc=new Scanner(System.in);
        ArrayList <String> contacts=new ArrayList <String>();

        System.out.println("Enter first Name");
        firstName=sc.nextLine();
        contacts.add(firstName);

        System.out.println("Enter last Name");
        lastName=sc.nextLine();
        contacts.add(lastName);

        System.out.println("Enter Address Name");
        address=sc.nextLine();
        contacts.add(address);

        System.out.println("Enter city Name");
        city=sc.nextLine();
        contacts.add(city);

        System.out.println("Enter zip code");
        zip=sc.nextLine();
        contacts.add(zip);

        System.out.println("Enter phone number");
        phone=sc.nextLine();
        contacts.add(phone);

        System.out.println("Enter email Address");
        email=sc.nextLine();
        contacts.add(email);

        for (int i=0;i < contacts.size();i++){
            System.out.println("Element at the index of ArrayList : "+i);
            System.out.println(contacts.get(i));
        }
    }

    public static void main(String[] args) {
        AddressBook ab=new AddressBook();
        ab.addDetails();

    }

}
