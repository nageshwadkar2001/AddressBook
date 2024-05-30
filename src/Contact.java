import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phone;
    String email;

    private static HashMap<String, String> person = new HashMap<>();

    public Contact() {
    }

    public void addContact() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first Name :");
        firstName = sc.nextLine();
        person.put("firstName", firstName);

        System.out.println("Enter last Name :");
        lastName = sc.nextLine();
        person.put("lastName", lastName);

        System.out.println("Enter Address Name :");
        address = sc.nextLine();
        person.put("address", address);

        System.out.println("Enter city Name :");
        city = sc.nextLine();
        person.put("city", city);

        System.out.println("Enter zip code :");
        zip = sc.nextLine();
        person.put("zip", zip);

        System.out.println("Enter phone number :");
        phone = sc.nextLine();
        person.put("phone", phone);

        System.out.println("Enter email Address :");
        email = sc.nextLine();
        person.put("email", email);

        System.out.println("Successfully Creted New Contact ");

    }

    public void updateContact() {
        System.out.println("Enter the value to change \n 1.First Name \n 2.Last Name \n 3.Address \n 4.City \n 5.State \n 6.Zip \n 7.PhoneNo \n 8.Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        String newValue;

        switch (option) {
            case 1: {
                System.out.println("Enter the new First Name");
                newValue = sc.nextLine();
                person.replace("firstName", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 2: {
                System.out.println("Enter the new Last Name");
                newValue = sc.nextLine();
                person.replace("lastName", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 3: {
                System.out.println("Enter the new Address");
                newValue = sc.nextLine();
                person.replace("address", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 4: {
                System.out.println("Enter the new city Name :");
                newValue = sc.nextLine();
                person.replace("city", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 5: {
                System.out.println("Enter the name of the nw State");
                newValue = sc.nextLine();
                person.replace("state", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 6: {
                System.out.println("Enter the new  zip  code ");
                newValue = sc.nextLine();
                person.replace("zip", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 7: {
                System.out.println("Enter the new phoneNumber");
                newValue = sc.nextLine();
                person.replace("phone", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            case 8: {
                System.out.println("Enter the new gmail");
                newValue = sc.nextLine();
                person.replace("gmail", newValue);
                System.out.println("!!!Information Updated!!!");
                break;
            }
            default: {
                System.out.println("Invalid Option.");
            }
        }
    }
    public void deleteInfo() {
        System.out.println("Enter the field to delete\n(1) First name\n(2) Last name\n(3) Address\n(4) City\n(5) State\n(6) Zip\n(7) Phone Number\n(8) Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                person.remove("firstName");
                System.out.println("First name removed.");
                break;
            case 2:
                person.remove("lastName");
                System.out.println("Last name removed.");
                break;
            case 3:
                person.remove("address");
                System.out.println("Address removed.");
                break;
            case 4:
                person.remove("city");
                System.out.println("City removed.");
                break;
            case 5:
                person.remove("state");
                System.out.println("State removed.");
                break;
            case 6:
                person.remove("zip");
                System.out.println("Zip removed.");
                break;
            case 7:
                person.remove("phoneNumber");
                System.out.println("Phone number removed.");
                break;
            case 8:
                person.remove("email");
                System.out.println("Email removed.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
    public String getInfo() {
        System.out.println("Updated Contact information");
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, String> entry : person.entrySet()) {
            output.append(entry.getKey()).append("is : ").append(entry.getValue()).append("\n");
        }
        return output.toString();
    }
}

