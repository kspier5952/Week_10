import java.util.*;
public class AccountSetup {
    public static void main(String[]args){
        String username;
        String password;
        int howLong;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a user name: ");
        username = input.next();
        System.out.print("Enter a password that is at least 8 characters: ");
        password = input.next();
        howLong = password.length();
        while (howLong < 8){
            System.out.print("Enter a password that is at least 8 characters: ");
            password = input.next();
            howLong = password.length();
        }
        input.close();
        System.out.println("Your user name is " + username.toLowerCase() + " and your password is " + password.toLowerCase());
        }
}