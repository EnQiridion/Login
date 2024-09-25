import java.util.Scanner;
public class Main {

    Scanner input = new Scanner(System.in);

   public static String[] username = {"admin", "user1", "user2"};
   public static String[] password = {"password123", "letmein", "qwerty"};

    public static void jaja() {
        int maxTries = 3;
        boolean loggedIn = false;
    }

    public static void main(String[] args) {
        login();
        validateLogin(username[1],password[1]);
        jaja();
    }
    public static boolean validateLogin(String user, String pswd){
        for (int i  = 0; i < username.length; i++){
            if (user.equalsIgnoreCase(username[i]) && pswd.equalsIgnoreCase(password[i])){
                System.out.println("ost");
                return true;
            }
        }
        return false;
    }
    public static boolean login() {
        Scanner input = new Scanner(System.in);
            System.out.println("Insert Username here");
            String inputUsername = input.nextLine();
            System.out.println("Insert Password here");
            String inputPassword = input.nextLine();
        return false;
    }
    public static boolean attempts(){
        for (int i = 0; i < 3; i++){

        }
        return false;
    }
}