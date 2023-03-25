import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your User Name: ");
        username = scanner.nextLine();
        System.out.print("Your Password: ");
        password = scanner.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Login successful!");
        }else{
            System.out.println("Login Failed!");
        }

    }
}